package com.firestudio.projectgmda.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.esri.arcgisruntime.ArcGISRuntimeEnvironment;
import com.esri.arcgisruntime.data.ServiceFeatureTable;
import com.esri.arcgisruntime.mapping.ArcGISMap;
import com.esri.arcgisruntime.mapping.BasemapStyle;
import com.esri.arcgisruntime.mapping.Viewpoint;
import com.esri.arcgisruntime.mapping.view.MapView;
import com.firestudio.projectgmda.R;
import com.firestudio.projectgmda.modal.GmdaLayer;
import com.firestudio.projectgmda.modal.Layer;
import com.firestudio.projectgmda.network.NetworkClientRetrofit;
import com.firestudio.projectgmda.network.LayerInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FetchLayerActivity extends AppCompatActivity {
    MapView mapView;
    TextView titleOne, titleTwo, titleThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fetch_layer);
        mapView = findViewById(R.id.fetch_layer_map);
        titleOne = findViewById(R.id.fetch_title);
        titleTwo = findViewById(R.id.fetch_title_two);
        titleThree = findViewById(R.id.fetch_title_three);
        LayerInterface layerInterface = NetworkClientRetrofit.getRetrofit().create(LayerInterface.class);
        Call<GmdaLayer> call = layerInterface.getLayer();
        call.enqueue(new Callback<GmdaLayer>() {
            @Override
            public void onResponse(Call<GmdaLayer> call, Response<GmdaLayer> response) {
                Toast.makeText(FetchLayerActivity.this, "Data Fetch SuccessFully", Toast.LENGTH_SHORT).show();
                titleOne.setText(new StringBuilder().append("copyrightText : ").append(response.body().getCopyrightText()).toString());
                titleTwo.setText(new StringBuilder().append("currentVersion : ").append(response.body().getCurrentVersion().toString()).toString());
                titleThree.setText(new StringBuilder().append("serviceDescription : ").append(response.body().getServiceDescription()).toString());

                setLayerWithCord(response.body().getInitialExtent().getXmin(),
                        response.body().getInitialExtent().getYmin(),
                        response.body().getInitialExtent().getSpatialReference().getLatestWkid());


            }

            @Override
            public void onFailure(Call<GmdaLayer> call, Throwable t) {
                Toast.makeText(FetchLayerActivity.this, "" + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void setLayerWithCord(Long xmin, Double ymin, Long latestWkid) {
        ArcGISRuntimeEnvironment.setApiKey(getString(R.string.api_key));
        ArcGISMap arcGISMap = new ArcGISMap(BasemapStyle.ARCGIS_TOPOGRAPHIC);
        mapView.setMap(arcGISMap);
        mapView.setViewpoint(new Viewpoint(xmin, ymin, latestWkid));

    }

    @Override
    protected void onPause() {
        super.onPause();
        mapView.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mapView.resume();
    }

    @Override
    protected void onDestroy() {
        mapView.dispose();
        super.onDestroy();

    }

}
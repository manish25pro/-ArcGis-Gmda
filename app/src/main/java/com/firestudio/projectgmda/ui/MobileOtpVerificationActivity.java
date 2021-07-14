package com.firestudio.projectgmda.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.firestudio.projectgmda.R;
import com.goodiebag.pinview.Pinview;

public class MobileOtpVerificationActivity extends AppCompatActivity {
    Pinview pinView;
    private static final String fixOtp = new String("36363");
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_otp_verification);
        loginButton = findViewById(R.id.login_button);
        pinView = findViewById(R.id.pin_view);

        loginButton.setOnClickListener(view ->
                {
                    String s = pinView.getValue();
                    if (s.isEmpty()) {
                        Toast.makeText(this, "Enter otp", Toast.LENGTH_SHORT).show();
                    } else if (s.length() != 5) {
                        Toast.makeText(this, "Enter Right Otp", Toast.LENGTH_SHORT).show();
                    } else if (s.equals(fixOtp)) {
                        Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(MobileOtpVerificationActivity.this, MainActivity.class));
                    finish();
                    }

                }
        );
    }
}
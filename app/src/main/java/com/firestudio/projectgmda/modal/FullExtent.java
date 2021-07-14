
package com.firestudio.projectgmda.modal;


public class FullExtent {


    private SpatialReference spatialReference;

    private Long xmax;

    private Long xmin;

    private Long ymax;

    private Long ymin;

    public SpatialReference getSpatialReference() {
        return spatialReference;
    }

    public void setSpatialReference(SpatialReference spatialReference) {
        this.spatialReference = spatialReference;
    }

    public Long getXmax() {
        return xmax;
    }

    public void setXmax(Long xmax) {
        this.xmax = xmax;
    }

    public Long getXmin() {
        return xmin;
    }

    public void setXmin(Long xmin) {
        this.xmin = xmin;
    }

    public Long getYmax() {
        return ymax;
    }

    public void setYmax(Long ymax) {
        this.ymax = ymax;
    }

    public Long getYmin() {
        return ymin;
    }

    public void setYmin(Long ymin) {
        this.ymin = ymin;
    }

}

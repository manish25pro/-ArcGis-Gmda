
package com.firestudio.projectgmda.modal;


public class Layer {


    private Boolean defaultVisibility;

    private String geometryType;

    private Long id;

    private Long maxScale;

    private Long minScale;

    private String name;

    private Long parentLayerId;

    private Object subLayerIds;

    private String type;

    public Boolean getDefaultVisibility() {
        return defaultVisibility;
    }

    public void setDefaultVisibility(Boolean defaultVisibility) {
        this.defaultVisibility = defaultVisibility;
    }

    public String getGeometryType() {
        return geometryType;
    }

    public void setGeometryType(String geometryType) {
        this.geometryType = geometryType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMaxScale() {
        return maxScale;
    }

    public void setMaxScale(Long maxScale) {
        this.maxScale = maxScale;
    }

    public Long getMinScale() {
        return minScale;
    }

    public void setMinScale(Long minScale) {
        this.minScale = minScale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParentLayerId() {
        return parentLayerId;
    }

    public void setParentLayerId(Long parentLayerId) {
        this.parentLayerId = parentLayerId;
    }

    public Object getSubLayerIds() {
        return subLayerIds;
    }

    public void setSubLayerIds(Object subLayerIds) {
        this.subLayerIds = subLayerIds;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}

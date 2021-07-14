
package com.firestudio.projectgmda.modal;


import java.util.List;

public class GmdaLayer {

    private Boolean allowGeometryUpdates;

    private Boolean allowTrueCurvesUpdates;

    private Boolean allowUpdateWithoutMValues;

    private String capabilities;

    private String copyrightText;

    private Double currentVersion;

    private String description;

    private DocumentInfo documentInfo;

    private Boolean enableZDefaults;

    private FullExtent fullExtent;

    private Boolean hasVersionedData;

    private InitialExtent initialExtent;

    private List<Layer> layers;

    private Long maxRecordCount;

    private Long maxRecordCountFactor;

    private Boolean onlyAllowTrueCurveUpdatesByTrueCurveClients;

    private String serviceDescription;

    private SpatialReference spatialReference;

    private String supportedQueryFormats;

    private Boolean supportsApplyEditsWithGlobalIds;

    private Boolean supportsDisconnectedEditing;

    private Boolean supportsQueryDomains;

    private Boolean supportsTrueCurve;

    private Boolean syncEnabled;

    private List<Object> tables;

    private String units;

    public Boolean getAllowGeometryUpdates() {
        return allowGeometryUpdates;
    }

    public void setAllowGeometryUpdates(Boolean allowGeometryUpdates) {
        this.allowGeometryUpdates = allowGeometryUpdates;
    }

    public Boolean getAllowTrueCurvesUpdates() {
        return allowTrueCurvesUpdates;
    }

    public void setAllowTrueCurvesUpdates(Boolean allowTrueCurvesUpdates) {
        this.allowTrueCurvesUpdates = allowTrueCurvesUpdates;
    }

    public Boolean getAllowUpdateWithoutMValues() {
        return allowUpdateWithoutMValues;
    }

    public void setAllowUpdateWithoutMValues(Boolean allowUpdateWithoutMValues) {
        this.allowUpdateWithoutMValues = allowUpdateWithoutMValues;
    }

    public String getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(String capabilities) {
        this.capabilities = capabilities;
    }

    public String getCopyrightText() {
        return copyrightText;
    }

    public void setCopyrightText(String copyrightText) {
        this.copyrightText = copyrightText;
    }

    public Double getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(Double currentVersion) {
        this.currentVersion = currentVersion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DocumentInfo getDocumentInfo() {
        return documentInfo;
    }

    public void setDocumentInfo(DocumentInfo documentInfo) {
        this.documentInfo = documentInfo;
    }

    public Boolean getEnableZDefaults() {
        return enableZDefaults;
    }

    public void setEnableZDefaults(Boolean enableZDefaults) {
        this.enableZDefaults = enableZDefaults;
    }

    public FullExtent getFullExtent() {
        return fullExtent;
    }

    public void setFullExtent(FullExtent fullExtent) {
        this.fullExtent = fullExtent;
    }

    public Boolean getHasVersionedData() {
        return hasVersionedData;
    }

    public void setHasVersionedData(Boolean hasVersionedData) {
        this.hasVersionedData = hasVersionedData;
    }

    public InitialExtent getInitialExtent() {
        return initialExtent;
    }

    public void setInitialExtent(InitialExtent initialExtent) {
        this.initialExtent = initialExtent;
    }

    public List<Layer> getLayers() {
        return layers;
    }

    public void setLayers(List<Layer> layers) {
        this.layers = layers;
    }

    public Long getMaxRecordCount() {
        return maxRecordCount;
    }

    public void setMaxRecordCount(Long maxRecordCount) {
        this.maxRecordCount = maxRecordCount;
    }

    public Long getMaxRecordCountFactor() {
        return maxRecordCountFactor;
    }

    public void setMaxRecordCountFactor(Long maxRecordCountFactor) {
        this.maxRecordCountFactor = maxRecordCountFactor;
    }

    public Boolean getOnlyAllowTrueCurveUpdatesByTrueCurveClients() {
        return onlyAllowTrueCurveUpdatesByTrueCurveClients;
    }

    public void setOnlyAllowTrueCurveUpdatesByTrueCurveClients(Boolean onlyAllowTrueCurveUpdatesByTrueCurveClients) {
        this.onlyAllowTrueCurveUpdatesByTrueCurveClients = onlyAllowTrueCurveUpdatesByTrueCurveClients;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public SpatialReference getSpatialReference() {
        return spatialReference;
    }

    public void setSpatialReference(SpatialReference spatialReference) {
        this.spatialReference = spatialReference;
    }

    public String getSupportedQueryFormats() {
        return supportedQueryFormats;
    }

    public void setSupportedQueryFormats(String supportedQueryFormats) {
        this.supportedQueryFormats = supportedQueryFormats;
    }

    public Boolean getSupportsApplyEditsWithGlobalIds() {
        return supportsApplyEditsWithGlobalIds;
    }

    public void setSupportsApplyEditsWithGlobalIds(Boolean supportsApplyEditsWithGlobalIds) {
        this.supportsApplyEditsWithGlobalIds = supportsApplyEditsWithGlobalIds;
    }

    public Boolean getSupportsDisconnectedEditing() {
        return supportsDisconnectedEditing;
    }

    public void setSupportsDisconnectedEditing(Boolean supportsDisconnectedEditing) {
        this.supportsDisconnectedEditing = supportsDisconnectedEditing;
    }

    public Boolean getSupportsQueryDomains() {
        return supportsQueryDomains;
    }

    public void setSupportsQueryDomains(Boolean supportsQueryDomains) {
        this.supportsQueryDomains = supportsQueryDomains;
    }

    public Boolean getSupportsTrueCurve() {
        return supportsTrueCurve;
    }

    public void setSupportsTrueCurve(Boolean supportsTrueCurve) {
        this.supportsTrueCurve = supportsTrueCurve;
    }

    public Boolean getSyncEnabled() {
        return syncEnabled;
    }

    public void setSyncEnabled(Boolean syncEnabled) {
        this.syncEnabled = syncEnabled;
    }

    public List<Object> getTables() {
        return tables;
    }

    public void setTables(List<Object> tables) {
        this.tables = tables;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

}

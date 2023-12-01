package com.test1;

public class ApiComparison {
	private Integer apiId;
	private String apiName;
	private Integer jsonSize;
	private String jsonProps;
	private String params;
	private String mapperComparison;
	private String mapperName;
	private Integer mapperSize;
	private Boolean binaryComparison;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public ApiComparison() {

	}

	public ApiComparison(Integer apiId, String apiName, Integer jsonSize, String jsonProps, String params,
			String mapperComparison, String mapperName, Integer mapperSize, Boolean binaryComparison,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.apiId = apiId;
		this.apiName = apiName;
		this.jsonSize = jsonSize;
		this.jsonProps = jsonProps;
		this.params = params;
		this.mapperComparison = mapperComparison;
		this.mapperName = mapperName;
		this.mapperSize = mapperSize;
		this.binaryComparison = binaryComparison;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getApiId() {
		return apiId;
	}

	public void setApiId(Integer apiId) {
		this.apiId = apiId;
	}

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public Integer getJsonSize() {
		return jsonSize;
	}

	public void setJsonSize(Integer jsonSize) {
		this.jsonSize = jsonSize;
	}

	public String getJsonProps() {
		return jsonProps;
	}

	public void setJsonProps(String jsonProps) {
		this.jsonProps = jsonProps;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public String getMapperComparison() {
		return mapperComparison;
	}

	public void setMapperComparison(String mapperComparison) {
		this.mapperComparison = mapperComparison;
	}

	public String getMapperName() {
		return mapperName;
	}

	public void setMapperName(String mapperName) {
		this.mapperName = mapperName;
	}

	public Integer getMapperSize() {
		return mapperSize;
	}

	public void setMapperSize(Integer mapperSize) {
		this.mapperSize = mapperSize;
	}

	public Boolean getBinaryComparison() {
		return binaryComparison;
	}

	public void setBinaryComparison(Boolean binaryComparison) {
		this.binaryComparison = binaryComparison;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}

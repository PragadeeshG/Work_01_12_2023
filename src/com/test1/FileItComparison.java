package com.test1;

public class FileItComparison {
	private String fileName;
	private String requestJson;
	private String responseJson;
	private String reqHeader;
	private String responseHeader;
	private Integer reqSize;
	private Integer responseSize;
	private String comparisonModule;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public FileItComparison() {

	}

	public FileItComparison(String fileName, String requestJson, String responseJson, String reqHeader,
			String responseHeader, Integer reqSize, Integer responseSize, String comparisonModule, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.fileName = fileName;
		this.requestJson = requestJson;
		this.responseJson = responseJson;
		this.reqHeader = reqHeader;
		this.responseHeader = responseHeader;
		this.reqSize = reqSize;
		this.responseSize = responseSize;
		this.comparisonModule = comparisonModule;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getRequestJson() {
		return requestJson;
	}

	public void setRequestJson(String requestJson) {
		this.requestJson = requestJson;
	}

	public String getResponseJson() {
		return responseJson;
	}

	public void setResponseJson(String responseJson) {
		this.responseJson = responseJson;
	}

	public String getReqHeader() {
		return reqHeader;
	}

	public void setReqHeader(String reqHeader) {
		this.reqHeader = reqHeader;
	}

	public String getResponseHeader() {
		return responseHeader;
	}

	public void setResponseHeader(String responseHeader) {
		this.responseHeader = responseHeader;
	}

	public Integer getReqSize() {
		return reqSize;
	}

	public void setReqSize(Integer reqSize) {
		this.reqSize = reqSize;
	}

	public Integer getResponseSize() {
		return responseSize;
	}

	public void setResponseSize(Integer responseSize) {
		this.responseSize = responseSize;
	}

	public String getComparisonModule() {
		return comparisonModule;
	}

	public void setComparisonModule(String comparisonModule) {
		this.comparisonModule = comparisonModule;
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

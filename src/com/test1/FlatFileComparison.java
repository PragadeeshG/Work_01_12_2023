package com.test1;

public class FlatFileComparison {
	private Integer fileId;
	private String fileName;
	private String extension;
	private Boolean zipApplicable;
	private String zipExtractor;
	private Integer fileCount;
	private Boolean compareTimestamp;
	private Integer binaryCount;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public FlatFileComparison() {

	}

	public FlatFileComparison(Integer fileId, String fileName, String extension, Boolean zipApplicable,
			String zipExtractor, Integer fileCount, Boolean compareTimestamp, Integer binaryCount, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.fileId = fileId;
		this.fileName = fileName;
		this.extension = extension;
		this.zipApplicable = zipApplicable;
		this.zipExtractor = zipExtractor;
		this.fileCount = fileCount;
		this.compareTimestamp = compareTimestamp;
		this.binaryCount = binaryCount;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getFileId() {
		return fileId;
	}

	public void setFileId(Integer fileId) {
		this.fileId = fileId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public Boolean getZipApplicable() {
		return zipApplicable;
	}

	public void setZipApplicable(Boolean zipApplicable) {
		this.zipApplicable = zipApplicable;
	}

	public String getZipExtractor() {
		return zipExtractor;
	}

	public void setZipExtractor(String zipExtractor) {
		this.zipExtractor = zipExtractor;
	}

	public Integer getFileCount() {
		return fileCount;
	}

	public void setFileCount(Integer fileCount) {
		this.fileCount = fileCount;
	}

	public Boolean getCompareTimestamp() {
		return compareTimestamp;
	}

	public void setCompareTimestamp(Boolean compareTimestamp) {
		this.compareTimestamp = compareTimestamp;
	}

	public Integer getBinaryCount() {
		return binaryCount;
	}

	public void setBinaryCount(Integer binaryCount) {
		this.binaryCount = binaryCount;
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

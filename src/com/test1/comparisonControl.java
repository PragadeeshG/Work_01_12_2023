package com.test1;

public class comparisonControl {
	private Integer controlIndicator;
	private String name;
	private boolean beanUse;
	private String beanName;
	private long actionId;
	private String actionMethod;
	private String actionRule;
	private String actionreturn;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public comparisonControl() {

	}

	public comparisonControl(Integer controlIndicator, String name, boolean beanUse, String beanName, long actionId,
			String actionMethod, String actionRule, String actionreturn, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.controlIndicator = controlIndicator;
		this.name = name;
		this.beanUse = beanUse;
		this.beanName = beanName;
		this.actionId = actionId;
		this.actionMethod = actionMethod;
		this.actionRule = actionRule;
		this.actionreturn = actionreturn;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getControlIndicator() {
		return controlIndicator;
	}

	public void setControlIndicator(Integer controlIndicator) {
		this.controlIndicator = controlIndicator;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isBeanUse() {
		return beanUse;
	}

	public void setBeanUse(boolean beanUse) {
		this.beanUse = beanUse;
	}

	public String getBeanName() {
		return beanName;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public long getActionId() {
		return actionId;
	}

	public void setActionId(long actionId) {
		this.actionId = actionId;
	}

	public String getActionMethod() {
		return actionMethod;
	}

	public void setActionMethod(String actionMethod) {
		this.actionMethod = actionMethod;
	}

	public String getActionRule() {
		return actionRule;
	}

	public void setActionRule(String actionRule) {
		this.actionRule = actionRule;
	}

	public String getActionreturn() {
		return actionreturn;
	}

	public void setActionreturn(String actionreturn) {
		this.actionreturn = actionreturn;
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

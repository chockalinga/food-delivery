package com.altimetrik.ee.demo.bean;

public class ComponentDetailsBean {

	private String componentName;
	private String componentIdentifier;

	public ComponentDetailsBean() {
		super();
	}

	public ComponentDetailsBean(String componentName, String componentIdentifier) {
		super();
		this.componentName = componentName;
		this.componentIdentifier = componentIdentifier;
	}

	public String getComponentName() {
		return componentName;
	}

	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}

	public String getComponentIdentifier() {
		return componentIdentifier;
	}

	public void setComponentIdentifier(String componentIdentifier) {
		this.componentIdentifier = componentIdentifier;
	}

	@Override
	public String toString() {
		return "ComponentDetailsBean [componentName=" + componentName + ", componentIdentifier=" + componentIdentifier
				+ "]";
	}

}

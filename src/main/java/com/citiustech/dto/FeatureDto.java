package com.citiustech.dto;

public class FeatureDto {
	
	private String name;
	private boolean enabled;
	private boolean active;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	@Override
	public String toString() {
		return "{name=" + name + ", enabled=" + enabled + ", active=" + active + "}";
	}
	
}

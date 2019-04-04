package com.citiustech.config;

import org.togglz.core.Feature;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;

public enum Features implements Feature {

	@Label("New content retrieval via CMS instead of text files.")
	CONTENT_RETRIEVAL_VIA_CMS,

	@Label("ServiceA")
	SERVICE_A,

	@Label("ServiceB")
	SERVICE_B,

	@Label("ServiceC")
	SERVICE_C,

	@Label("New Elastic Search Backend replacing RDBMS for text-based searches.")
	TEXT_BASED_SEARCH_VIA_ELASTIC_SEARCH,

	@Label("New some service.")
	USE_NEW_SOMESERVICE;

	public boolean isActive() {
		return FeatureContext.getFeatureManager().isActive(this);
	}
}
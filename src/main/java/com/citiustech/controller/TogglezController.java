package com.citiustech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.togglz.core.manager.FeatureManager;

@RestController
@RequestMapping(value = "features")
public class TogglezController {

	private FeatureManager manager;

	TogglezController(FeatureManager manager) {

	}
//
//	@GetMapping(value = "/demo-cms/{id}")
//	public String getDemoCms(@PathVariable("id") String id) {
//		if (FeatureToggles.CONTENT_RETRIEVAL_VIA_CMS.isActive()) {
//			return "New CMS Backend is active";
//		}
//		return "Still relying in existing / legacy cms backend implementation";
//	}
//
//	@GetMapping(value = "/demo-es/{id}")
//	public String getDemoEs(@PathVariable("id") String id) {
//		if (FeatureToggles.TEXT_BASED_SEARCH_VIA_ELASTIC_SEARCH.isActive()) {
//			return "New ElasticSearch Backend is active";
//		}
//		return "Still relying in existing / legacy RDBMS backend implementation";
//	}
//
//	@GetMapping(value = "/demo-someservice/{id}")
//	public String getDemoSomeService(@PathVariable("id") String id) {
//		return this.baseService.getSomeValue();
//	}

	// http://localhost:8080/togglez-backend/features/enabled

	@GetMapping(value = "/enabled")
	public String getDemoSomeService() {

//		if (manager.isActive(Features.SERVICE_A)) {
//			return "ertsert";
//		}

		return "serviceA";
	}

}
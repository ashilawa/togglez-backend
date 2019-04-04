package com.citiustech.service.impl;

import com.citiustech.service.BaseService;

public class ServiceA implements BaseService {

	@Override
	public String getSomeValue() {
		return "ServiceA";
	}
}
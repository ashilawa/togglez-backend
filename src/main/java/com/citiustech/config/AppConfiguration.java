package com.citiustech.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.togglz.core.Feature;
import org.togglz.core.manager.EnumBasedFeatureProvider;
import org.togglz.core.manager.TogglzConfig;
import org.togglz.core.repository.StateRepository;
import org.togglz.core.spi.FeatureProvider;
import org.togglz.core.user.FeatureUser;
import org.togglz.core.user.SimpleFeatureUser;
import org.togglz.core.user.UserProvider;

@Configuration
public class AppConfiguration implements TogglzConfig {

	@Bean
	public FeatureProvider featureProvider() {
		return new EnumBasedFeatureProvider(Features.class);
	}
//	@Bean
//	public BaseService newSomeService() {
//		return new NewSomeServiceImpl();
//	}
//
//	@Bean
//	public BaseService oldSomeService() {
//		return new OldSomeServiceImpl();
//	}
//
//	@Bean
//	public FeatureProxyFactoryBean proxiedSomeService() {
//		FeatureProxyFactoryBean proxyFactoryBean = new FeatureProxyFactoryBean();
//		proxyFactoryBean.setFeature(FeatureToggles.USE_NEW_SOMESERVICE.name());
//		proxyFactoryBean.setProxyType(BaseService.class);
////		proxyFactoryBean.setActive(this.newSomeService());
////		proxyFactoryBean.setInactive(this.oldSomeService());
//		return proxyFactoryBean;
//	}

	@Override
	public Class<? extends Feature> getFeatureClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StateRepository getStateRepository() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserProvider getUserProvider() {
		return new UserProvider() {
			@Override
			public FeatureUser getCurrentUser() {
				return new SimpleFeatureUser("admin", true);
			}
		};
	}

//	@Bean
//	@Primary
//	public BaseService baseService(@Autowired FeatureProxyFactoryBean proxiedSomeService) throws Exception {
//		return (BaseService) proxiedSomeService.getObject();
//	}
}
package com.citiustech.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.togglz.core.Feature;
import org.togglz.core.manager.FeatureManager;
import org.togglz.core.util.NamedFeature;

import com.citiustech.dto.FeatureDto;

@RestController
public class TogglezController {
    private static final String GREETING = "Greetings from Spring Boot!";
    
    private final FeatureManager manager;

    public static final Feature DEFAULT_SERVICE1 = new NamedFeature("DEFAULT_SERVICE1");
    
    public static final Feature DEFAULT_SERVICE2 = new NamedFeature("DEFAULT_SERVICE2");
    
    public TogglezController(FeatureManager manager) {
		this.manager = manager;
	}

	@RequestMapping("/")
    public ResponseEntity<?> index() {
        if (manager.isActive(DEFAULT_SERVICE1)) {
            StringBuilder sb = new StringBuilder(GREETING);
            if (manager.isActive(DEFAULT_SERVICE2)) {
                sb.reverse();
            }
            return ResponseEntity.ok().body(sb.toString());
        }
        return ResponseEntity.notFound().build();
    }
	// http://localhost:8080/togglz-console/index

	@GetMapping(value = "/getAllFeatures")
	public ResponseEntity<Set<FeatureDto>> getAllFeatures() {
		Set<FeatureDto> set = new HashSet<>();
		manager.getFeatures().stream().forEach(feature -> {
			FeatureDto dto = new FeatureDto();
			dto.setName(feature.name());
			dto.setEnabled(manager.getFeatureState(feature).isEnabled());
			dto.setActive(manager.isActive(feature));
			set.add(dto);
		});

		return ResponseEntity.ok(set);
	}

}
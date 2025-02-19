/*package com.example.learnSpringBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.learnSpringBoot.CurrencyServiceConfigurationListController.ConfigurationDetail;

@RestController
public class CurrencyServiceConfigurationList {
	@Autowired
	private CurrencyServiceConfigurationListController configuration;
	
	@RequestMapping("/currency-configuration-list")
	@Qualifier("CurrencyServiceConfigurationListController")
	public List<ConfigurationDetail> retrieveAllCourses() {
	    if (configuration.getConfigurations() == null) {
	        throw new RuntimeException("No configurations found");
	    }
	    return configuration.getConfigurations();
	}



}*/

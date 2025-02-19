package com.example.learnSpringBoot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class CurrencyServiceConfigurationController {

	@Autowired
	private CurrencyServiceConfiguration configuration;
	
	@RequestMapping("/currency-configuration")
	//public List<CurrencyServiceConfiguration> retrieveAllCourses()
	public CurrencyServiceConfiguration retrieveAllCourses()
	{
		/*return Arrays.asList(new CurrencyServiceConfiguration("http://default.udemy.com","defaultusername","defaultkey"),
				new CurrencyServiceConfiguration("http://default.udemy.com","defaultusername","defaultkey")
				);*/
		return configuration;
		
	}
	
	
}

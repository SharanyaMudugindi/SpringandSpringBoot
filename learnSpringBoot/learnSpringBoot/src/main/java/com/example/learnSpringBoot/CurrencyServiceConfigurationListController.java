/*package com.example.learnSpringBoot;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Primary;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@EnableConfigurationProperties(CurrencyServiceConfigurationListController.class)
@ConfigurationProperties(prefix="currency-service-list")
@Component
@Primary
public class CurrencyServiceConfigurationListController {
	private List<ConfigurationDetail> configurations;
	
	public List<ConfigurationDetail> getConfigurations()
	{
		return configurations;
	}
	public void setConfigurations(List<ConfigurationDetail> configurations)
	{
		this.configurations=configurations;
	}
	
	public static class ConfigurationDetail
	{
		private String url;
		private  String username;
		private String key;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	}
}*/

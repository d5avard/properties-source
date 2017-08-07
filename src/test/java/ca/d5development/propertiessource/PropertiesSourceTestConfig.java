package ca.d5development.propertiessource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:test.properties")
public class PropertiesSourceTestConfig {

	@Value("${test.value}")
	private String test;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		return propertySourcesPlaceholderConfigurer;
	}
	
	@Bean
	public PropertiesBroker propertiesBroker() {
		PropertiesBroker propertiesBroker = new PropertiesBroker();
		propertiesBroker.setTest(this.test);
		
		return propertiesBroker;
	}
}

package com.configure.app.appconfig.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EntityScan("com")
@EnableJpaRepositories(basePackages = "com")
public class DataBaseConfig {

	@Bean
	@ConfigurationProperties("hibernate.datasource")
	public ComboPooledDataSource dataSource() {
		return new ComboPooledDataSource();
	}

}

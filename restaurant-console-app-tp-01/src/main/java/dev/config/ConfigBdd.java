package dev.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class ConfigBdd {

	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.mariadb.jdbc.Driver");
		dataSource.setUrl("jdbc:mariadb://localhost:3306/restaurant-bdd");
		dataSource.setUsername("root");
		dataSource.setPassword("");
		return dataSource;
	}
}

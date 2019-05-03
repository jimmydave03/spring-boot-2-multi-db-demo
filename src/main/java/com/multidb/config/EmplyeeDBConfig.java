package com.multidb.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
	entityManagerFactoryRef = "empEntityManagerFactory",
	transactionManagerRef = "empTransactionManager",
	basePackages = { "com.multidb.repository.employee" }
)
public class EmplyeeDBConfig {
	
	@Bean(name = "empDataSource")
    @ConfigurationProperties(prefix="spring.second-datasource")
    public DataSource secondDataSource() {
        DataSource ds =  DataSourceBuilder.create().build();
        return ds;
    }
	
	@Bean(name = "empEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean barEntityManagerFactory(EntityManagerFactoryBuilder builder, @Qualifier("empDataSource") DataSource dataSource) {
		return builder
	        .dataSource(dataSource)
	        .packages("com.multidb.entity.employee")
	        .persistenceUnit("EmployeeDB")
	        .build();
	}
	
	@Bean(name = "empTransactionManager")
	public PlatformTransactionManager barTransactionManager(@Qualifier("empEntityManagerFactory") EntityManagerFactory barEntityManagerFactory) {
		return new JpaTransactionManager(barEntityManagerFactory);
	}
}

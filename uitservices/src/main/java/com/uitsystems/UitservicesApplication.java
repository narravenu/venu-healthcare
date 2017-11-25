package com.uitsystems;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;

import com.uitsystems.dao.PatientDao;
import com.uitsystems.domain.Patient;

@SpringBootApplication
public class UitservicesApplication {
	@Autowired
	private PatientDao pdao;
	
	@Autowired
	private DataSource ds;

	public static void main(String[] args) {
		SpringApplication.run(UitservicesApplication.class, args);
	}
	
	@Bean
	public HibernateJpaSessionFactoryBean sessionFactory() {
		return new HibernateJpaSessionFactoryBean();
	}

}

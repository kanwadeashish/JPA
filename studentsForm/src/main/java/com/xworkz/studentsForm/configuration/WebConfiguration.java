package com.xworkz.studentsForm.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@ComponentScan("com.xworkz.studentsForm")
public class WebConfiguration {

    public WebConfiguration(){
        System.out.println("WebConfiguration....");
    }

    @Bean
    public ViewResolver viewResolver(){
        return new InternalResourceViewResolver("/",".jsp");
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean factoryBean(){

        LocalContainerEntityManagerFactoryBean entityManagerFactory =
                new LocalContainerEntityManagerFactoryBean();

        entityManagerFactory.setPackagesToScan("com.xworkz.studentsForm.entity");
        entityManagerFactory.setDataSource(dataSource());
        entityManagerFactory.setJpaProperties(properties());
        entityManagerFactory.setJpaVendorAdapter(new HibernateJpaVendorAdapter());

        return entityManagerFactory;
    }

    public DataSource dataSource(){

        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();

        driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/students_form_db");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("root");

        return driverManagerDataSource;
    }

    public Properties properties() {

        Properties properties = new Properties();
        properties.setProperty("hibernate.hbm2ddl.auto","update");
        properties.setProperty("hibernate.show_sql","true");

        return properties;
    }

}

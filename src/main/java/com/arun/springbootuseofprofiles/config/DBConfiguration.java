package com.arun.springbootuseofprofiles.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
@Getter
@Setter
public class DBConfiguration {

    private String driverClassName;
    private String url;
    private String userName;
    private String password;
    private String details;

    @Profile("dev")
    @Bean
    public String devDBConnection() {
        details = "Dev Connection :  driver Name " + driverClassName + " url " + url + " user name " + userName;
        System.out.println(details);
        return details;
    }

    @Profile("qa")
    @Bean
    public String qaDBConnection() {
        details = "QA Connection :  driver Name " + driverClassName + " url " + url + " user name " + userName;
        System.out.println(details);
        return details;
    }

    @Profile("prod")
    @Bean
    public String prodDBConnection() {
        details = "Prod Connection :  driver Name " + driverClassName + " url " + url + " user name " + userName;
        System.out.println(details);
        return details;
    }
}

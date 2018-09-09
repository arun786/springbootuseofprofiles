# springbootuseofprofiles


We can use various profiles for Spring boot applications. Steps involved are

1. Create different application.properties


    1. application-dev.properties
    
            spring.datasource.driver-class-name=org.h2.Driver
            spring.datasource.url=jdbc:h2:mem:testdb
            spring.datasource.username=sa
            spring.datasource.password=
    

    2. application-qa.properties

    
            spring.datasource.driver-class-name=com.mysql.jdbc.Driver
            spring.datasource.url=jdbc:mysql://localhost:3306/tcrmd00
            spring.datasource.username=root
            spring.datasource.password=root
    
2. Specify the profile which is required in application.properties


            spring.profiles.active=qa
            
    
3. Create a configuration bean
    
    
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

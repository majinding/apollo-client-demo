package com.example.demo.config;


import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableApolloConfig
@Data
public class MyApolloConfig {

    @Value("${key2}")
    private String key2;

}

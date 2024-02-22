package org.example.singletonScope.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.singletonScope.bean")
public class AppConfig {
}

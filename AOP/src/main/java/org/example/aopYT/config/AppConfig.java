package org.example.aopYT.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"org.example.aopYT.people","org.example.aopYT.aspects"})
@EnableAspectJAutoProxy
public class AppConfig {
}

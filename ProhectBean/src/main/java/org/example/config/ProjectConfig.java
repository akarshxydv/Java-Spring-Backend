package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.bean","org.example.services","org.example.implementation.music","org.example.implementation.tyres"})
public class ProjectConfig {
}

package org.example.withAOP.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@org.springframework.context.annotation.Configuration
@ComponentScan(basePackages = {"org.example.withAOP.beans","org.example.withAOP.implementations","org.example.withAOP.aspect"})
@EnableAspectJAutoProxy
public class Configuration {

}

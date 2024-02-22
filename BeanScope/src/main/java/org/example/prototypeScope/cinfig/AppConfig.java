package org.example.prototypeScope.cinfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.prototypeScope.bean")
public class AppConfig {
}

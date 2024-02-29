package withoutAOP.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"withoutAOP.beans","withoutAOP.implementation"})
public class AppConfig {
}

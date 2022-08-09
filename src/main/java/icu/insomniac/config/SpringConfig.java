package icu.insomniac.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("icu.insomniac")
@PropertySource("classpath:my.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
public class SpringConfig {
}

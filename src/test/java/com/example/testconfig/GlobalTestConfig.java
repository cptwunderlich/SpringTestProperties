package com.example.testconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @author Benjamin Maurer
 * @since 21.11.2018
 */
@Configuration
@Order(Ordered.HIGHEST_PRECEDENCE)
@PropertySource("classpath:application-test.properties")
public class GlobalTestConfig {
}

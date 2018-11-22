package com.example.testconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.test.context.ActiveProfiles;

/**
 * This won't work
 */
@Configuration
@Order(Ordered.HIGHEST_PRECEDENCE)
@TestAnnotation
// @ActiveProfiles("test")
// @TestPropertySource(locations = "classpath:application-test.properties")
// @PropertySource("classpath:application-test.properties")
public class GlobalTestConfig {
}

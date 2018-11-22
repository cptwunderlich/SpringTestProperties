package com.example.testconfig;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import org.springframework.test.context.ActiveProfiles;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@ActiveProfiles("test")
@Retention(RUNTIME)
@Target(TYPE)
public @interface TestAnnotation {
}

package com.example.testconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

/**
 * @author Benjamin Maurer
 * @since 21.11.2018
 */
@Service
public class TestApplicationRunner implements ApplicationRunner {

	@Value("${my.test.property}")
	private String testproperty;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("***Value is: " + testproperty);
	}
}

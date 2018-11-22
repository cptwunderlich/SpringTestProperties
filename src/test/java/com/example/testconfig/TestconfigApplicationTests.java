package com.example.testconfig;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
//@TestPropertySource(locations = "classpath:application-test.properties")
//@TestAnnotation
//@ActiveProfiles("test")
public class TestconfigApplicationTests {

	@Value("${my.test.property}")
	private String testproperty;

	@Value("${fullapp.property}")
	private String fullappProperty;

	@Test
	public void testPropertyEqualsTestConfig() {
		Assert.assertEquals("unittest", testproperty);
	}

	@Test
	public void appPropertyDefined() {
		Assert.assertEquals("onlyinapp", fullappProperty);
	}

}

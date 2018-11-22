package com.example.testconfig;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;

@TestAnnotation
public class MetaAnnotatedTest {
	@Value("${my.test.property}")
	private String testproperty;

	@Test
	public void testPropertyEqualsTestConfig() {
		Assert.assertEquals("unittest", testproperty);
	}
}

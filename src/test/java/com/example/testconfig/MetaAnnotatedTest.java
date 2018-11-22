package com.example.testconfig;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestAnnotation
public class MetaAnnotatedTest {
	@Value("${my.test.property}")
	private String testproperty;

	@Test
	public void testPropertyEqualsTestConfig() {
		Assert.assertEquals("unittest", testproperty);
	}
}

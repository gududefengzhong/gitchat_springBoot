package com.rochestor.hello;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloApplicationTests {

	private Logger logger = LoggerFactory.getLogger(getClass());
	@Test
	public void test() {
		logger.info("20200928".replace("/", "_"));
	}
}
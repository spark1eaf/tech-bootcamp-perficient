package com.perficient.techbootcampScott;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
@SpringBootTest
class TechbootcampScottApplicationTests {
	private static final Logger logger = LoggerFactory.getLogger(TechbootcampScottApplicationTests.class);
	//TempConverter a = Mockito.mock(TempConverter.class);
	@Test
//	void tempisnotull(){
//		assert a.currentTemp == 0;
//	}
//	@Test
//	void tempisnull(){
//		assert a.currentTemp == 3;
//	}
	void contextLoads() {
		logger.debug("DEBUG");
		logger.trace("TRACE");
		logger.info("INFO");
		logger.warn("WARN");
		logger.error("ERROR");
		String foo = "foo";
		logger.debug("foo is " + foo);  //do not do string concat
		logger.debug("foo is {}", foo);
	}

}

package com.passion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PassionApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void getName() {
		System.out.println(PassionApplication.class.getName());
	}

}

package com.example.tazopoisk;

import org.junit.Test;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		int a = 2;
		for( int i = 0; i < 31; i++){
			a *=2;
			System.out.println(a);
		}


	}

}

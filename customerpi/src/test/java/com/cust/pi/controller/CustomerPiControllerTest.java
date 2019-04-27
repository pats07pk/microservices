package com.cust.pi.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cust.pi.vo.CustomerVo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerPiControllerTest {

	@Mock private CustomerPiController controller;
	@Mock private CustomerVo custVo;
	
	@Test
	public void testCreateCustomerPi() {
		//controller.createCustomerPi(custVo);
	}

}

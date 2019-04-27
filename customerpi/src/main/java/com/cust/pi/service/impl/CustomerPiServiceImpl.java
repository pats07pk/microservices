package com.cust.pi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cust.pi.dao.CustomerPiDao;
import com.cust.pi.service.CustomerPiService;
import com.cust.pi.vo.CustomerVo;

@Service
public class CustomerPiServiceImpl implements CustomerPiService {

	@Autowired CustomerPiDao custDaoImpl;
	
	@Override
	public String createCustomer(CustomerVo customer) {
		return custDaoImpl.createCustomer(customer);
	}

}

package com.cust.pi.dao.impl;

import org.springframework.stereotype.Repository;

import com.cust.pi.dao.CustomerPiDao;
import com.cust.pi.vo.CustomerVo;

@Repository
public class CustomerPiDaoImpl implements CustomerPiDao{

	@Override
	public String createCustomer(CustomerVo customer) {
		// TODO Auto-generated method stub
		return customer.toString();
	}

}

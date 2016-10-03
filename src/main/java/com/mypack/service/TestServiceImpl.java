package com.mypack.service;

import org.springframework.stereotype.Service;

@Service("ServiceTest")
public class TestServiceImpl implements TestService {

	@Override
	public void test() {
		System.out.println("this is service test");

	}

}

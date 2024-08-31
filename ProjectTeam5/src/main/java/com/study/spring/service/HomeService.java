package com.study.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.spring.repository.HomeRepository;

@Service
public class HomeService {
	@Autowired
	private HomeRepository homeRepository;
}

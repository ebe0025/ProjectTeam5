package com.study.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.study.spring.service.HomeService;

@Controller
public class HomeController {
	@Autowired
	private HomeService homeService;
}

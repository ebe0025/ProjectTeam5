package com.study.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.study.spring.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;
}

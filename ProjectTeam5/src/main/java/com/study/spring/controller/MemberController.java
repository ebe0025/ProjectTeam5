package com.study.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.study.spring.service.MemberService;

@RestController
public class MemberController {
	@Autowired
	private MemberService memberService;
}

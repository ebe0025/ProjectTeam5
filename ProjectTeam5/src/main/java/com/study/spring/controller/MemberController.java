package com.study.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.study.spring.domain.Member;
import com.study.spring.service.MemberService;

@RestController
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@PostMapping("member/register")
	public String insertMember(@RequestBody Member member) {
		
		memberService.insertMember(member);
		return "success";
	}
	
}

package com.study.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.study.spring.service.GuestbookService;

@Controller
public class GuestbookController {
	@Autowired
	private GuestbookService guestbookService;
}

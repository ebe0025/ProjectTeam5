package com.study.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.study.spring.service.GuestbookService;

@RestController
public class GuestbookController {
	@Autowired
	private GuestbookService guestbookService;
}

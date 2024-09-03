package com.study.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.study.spring.service.FriendsService;

@RestController
public class FriendsController {
	@Autowired
	private FriendsService friendsService;
}

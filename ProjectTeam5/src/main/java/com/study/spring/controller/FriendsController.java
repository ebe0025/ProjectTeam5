package com.study.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.spring.service.FriendsService;

@Service
public class FriendsController {
	@Autowired
	private FriendsService friendsService;
}

package com.study.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.spring.repository.FriendsRepository;

@Service
public class FriendsService {
	@Autowired
	private FriendsRepository friendsRepository;
}

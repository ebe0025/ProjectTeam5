package com.study.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.spring.repository.GuestbookRepository;

@Service
public class GuestbookService {
	@Autowired
	private GuestbookRepository guestbookRepository;
}

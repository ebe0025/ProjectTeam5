package com.study.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.study.spring.service.DiaryService;

@RestController
public class DiaryController {
	@Autowired
	private DiaryService diaryService;
}

package com.study.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.study.spring.service.DiaryService;

@Controller
public class DiaryController {
	@Autowired
	private DiaryService diaryService;
}

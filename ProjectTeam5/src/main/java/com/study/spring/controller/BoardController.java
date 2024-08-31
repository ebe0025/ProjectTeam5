package com.study.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.study.spring.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;
}

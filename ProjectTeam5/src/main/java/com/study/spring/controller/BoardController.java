package com.study.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.study.spring.domain.Board;
import com.study.spring.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	@ResponseBody
	@PostMapping("/board/write")
	public String write(Board board, @RequestParam("image") MultipartFile img) throws Exception {
		
		
		boardService.write(board, img);
		
		
		
		return "안녕";
	}
}

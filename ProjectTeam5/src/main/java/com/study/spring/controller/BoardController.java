package com.study.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.study.spring.domain.Board;
import com.study.spring.service.BoardService;

@Controller
@CrossOrigin(origins = "http://localhost:3000")
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	@ResponseBody
	@PostMapping("/board/write")
	public String write(Board board, @RequestParam("image") MultipartFile img) throws Exception {
		
		
		boardService.write(board, img);
		
		
		
		return "안녕";
	}
	
	@ResponseBody
	@GetMapping("/board/totalBoard")
	public List<Board> totalBoard(){
		List<Board> list = boardService.totalBoard();
		System.out.println(list);
		return list;
	}
}

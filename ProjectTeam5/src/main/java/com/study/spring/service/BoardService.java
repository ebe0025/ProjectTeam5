package com.study.spring.service;

import java.io.File;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.study.spring.domain.Board;
import com.study.spring.repository.BoardRepository;

@Service
public class BoardService {
	@Autowired
	private BoardRepository boardRepository;

	public void write(Board board, MultipartFile img) throws Exception {
		
		
		String projectPath = System.getProperty("user.dir") + "\\src\\main\\resources\\static\\files";
		
		UUID uuid = UUID.randomUUID();
		
		String fileName = uuid + "_" + img.getOriginalFilename();
		
		File saveFile = new File(projectPath, fileName);
		
		img.transferTo(saveFile);
		
		board.setImgName(fileName);
		board.setImgPath("/files/" + fileName);
		
		boardRepository.save(board);
		
	}
}

package com.study.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("board") //메인 어플리케이션에서 보드를 호출해야하기 때문에 ID(board)가 필요함.
public class Board {
	
	@Autowired
	private Write write;
	
	//게시판 글쓰기를 호출하는 Method
	public void boardWrite() {
		write.doWrite();
	}
}

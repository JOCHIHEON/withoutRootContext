package com.study.board;

import org.springframework.stereotype.Component;

@Component
public class Write {
	private String boardName;

	public String getBoardName() {
		return boardName;
	}

	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}
	public Write() {
		this.init();
	}
	public void init() {
		this.setBoardName("free Board");
	}
	public void doWrite() {
		System.out.println(this.getBoardName() + "Write down!!");
	}
	
}

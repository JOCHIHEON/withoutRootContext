package com.study.board;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//Spring Context 파일을 만들지 않고 Annotation만을 이용
//Board를 호출할 메인 클래스
@Configuration
@ComponentScan(basePackages= {"com.study.board"})
public class MainApp {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(MainApp.class); //설정파일이 있는 클래스를 알려줘야함.
		ac.refresh(); // 어노테이션 정보 갱신
		Board board = (Board)ac.getBean("board"); //id값을 복사
		board.boardWrite();
	}

}

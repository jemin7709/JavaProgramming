package kr.ac.inha.board.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// ctrl + shift + o : 사용하지 않는 import 지우기

@RestController
public class BoardController {
	@RequestMapping("/hello")
	public String hello() {
		return "hello world!!";
	}
	
	@RequestMapping("/inha")
	public String inha(String param) {
		return param + "inha.ac.kr";
	}
	
	@RequestMapping("/name")
	public String name(String id) {
		return "당신의 학번은 : " + id;
	}
	
	@RequestMapping("/gugu")
	public String gugu(Integer num) {
		String ans ="";
		for(int i=1;i<10;i++) {
			ans += Integer.toString(num) + "*" + Integer.toString(i) + "=" + Integer.toString(num*i) + " ";
		}
		return ans;
	}
}

package kr.ac.inha.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import kr.ac.inha.mvc.service.JspService;


// ctrl + shift + o : 사용하지 않는 import 지우기

@RestController
public class BoardController {
	@Autowired
	JspService jspService;
	
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
	
	@RequestMapping("/gugudan")
	public ModelAndView gugugu(Integer num) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("gugudan");
		if (num != null) {
			String ans = "";
			for (int i = 1; i < 10; i++) {
				ans = ans + num + "*" + i + "=" + num * i + " ";
			}
			mv.addObject("gugu", ans);
			mv.addObject("title", "구구단");
		}
		return mv;
	}
	
	@RequestMapping("/sum")
	public ModelAndView sum() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("sum");
		int s = (100*101)/2;
		mv.addObject("sum", s);
		mv.addObject("title", "합");
		return mv;
	}
	
	@RequestMapping("/count")
	public String count() {
		return jspService.count();
	}
}

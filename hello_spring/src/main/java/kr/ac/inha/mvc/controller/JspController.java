package kr.ac.inha.mvc.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.ac.inha.mvc.service.JspService;

@Controller
public class JspController {
	@Autowired
	JspService jspService;
	
	@RequestMapping("/hello.do")
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hello");
		return mv;
	}
	
	@RequestMapping("/board.do")
	public ModelAndView board(@RequestParam(value="title", required = false, defaultValue = "과목정보")String subname) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.addObject("title", subname);
		mv.setViewName("board");
		mv.addObject("count", jspService.count());
		List<?> boardList =  jspService.boardList();
		mv.addObject("boardList", boardList);
		return mv;
	}
	
	@RequestMapping("/regSubject.do")
	public ModelAndView regSubject() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("boardDetail");
		mv.addObject("title", "과목등록");
		return mv;
	}
	
	@RequestMapping("/regitSubject.do")
	public ModelAndView regitSubject(String id, String subject, String grade,
			String useYn, String description, String regUser) {
		System.out.println(id + subject + grade);
		HashMap<String, String> hashmap = new HashMap<>();
		hashmap.put("id", id);
		hashmap.put("subject", subject);
		hashmap.put("grade", grade);
		hashmap.put("useYn", useYn);
		hashmap.put("description", description);
		hashmap.put("regUser", regUser);
		try {
			jspService.regitSubject(hashmap);

		} catch (Exception e) {
			// TODO: handle exception
		}
		ModelAndView mv = new ModelAndView();
		mv.setViewName("boardDetail");
		mv.addObject("title", "과목등록");
		return mv;
	}
	
}

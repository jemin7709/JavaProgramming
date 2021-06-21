package kr.ac.inha.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.ac.inha.dto.MemberDto;
import kr.ac.inha.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	MemberService memberService;
	
	@RequestMapping("/welcome.do")
	public ModelAndView welcome() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("welcome");
		return mv;
	}
	@RequestMapping("/member/addMember.do")
	public ModelAndView addMember() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("member/addMember");
		return mv;
	}
	@RequestMapping("/member/loginMember.do")
	public ModelAndView loginMember() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("member/loginMember");
		return mv;
	}
	@RequestMapping("/member/updateMember.do")
	public ModelAndView updateMember(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		HttpSession session = request.getSession();
		mv.setViewName("member/updateMember");
	    String ID = (String) session.getAttribute("ID");
		try {
			MemberDto member = memberService.getMember(ID);
			mv.addObject("member", member);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return mv;
	}
	@RequestMapping("/member/processAddMember.do")
	public ModelAndView signUp(@RequestParam("id")String ID, @RequestParam("pw") String PW, 
							   @RequestParam("nickname") String NICKNAME, @RequestParam("name") String NAME,
							   @RequestParam("mail") String MAIL, @RequestParam("hello") String HELLO) {
			ModelAndView mv = new ModelAndView();
			MemberDto member = new MemberDto();
			member.setID(ID);
			member.setPW(PW);
			member.setNICKNAME(NICKNAME);
			member.setNAME(NAME);
			member.setMAIL(MAIL);
			member.setHELLO(HELLO);
			try {
				memberService.signUp(member);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			mv.addObject("ID", ID);
			mv.setViewName("welcome");
			return mv;
	}
	@RequestMapping("/member/processLoginMember.do")
	public ModelAndView logIn(@RequestParam("id")String ID, @RequestParam("pw") String PW) {
		ModelAndView mv = new ModelAndView();
		String msg = "";
		try {
			if(PW.equals(memberService.logIn(ID))){
				mv.addObject("ID", ID);
				mv.setViewName("welcome");
			}
			else {
				mv.setViewName("member/loginMember");
				msg = "PW";
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			mv.setViewName("member/loginMember");
			msg = "ID";
		}
		mv.addObject("msg", msg);
		return mv;
	}
	@RequestMapping("/member/logoutMember.do")
	public ModelAndView logOut() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("menu");
		mv.addObject("out", "y");
		return mv;
	}
	@RequestMapping("/member/processUpdateMember.do")
	public ModelAndView update(@RequestParam("id")String ID, @RequestParam("pw") String PW, 
							   @RequestParam("nickname") String NICKNAME, @RequestParam("name") String NAME,
							   @RequestParam("mail") String MAIL, @RequestParam("hello") String HELLO) {
			ModelAndView mv = new ModelAndView();
			MemberDto member = new MemberDto();
			member.setID(ID);
			member.setPW(PW);
			member.setNICKNAME(NICKNAME);
			member.setNAME(NAME);
			member.setMAIL(MAIL);
			member.setHELLO(HELLO);
			try {
				memberService.update(member);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			mv.setViewName("welcome");
			return mv;
	}
	@RequestMapping("/member/deleteMember.do")
	public ModelAndView delete(@RequestParam("id")String ID) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("menu");
		mv.addObject("out", "y");
		try {
			memberService.delete(ID);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return mv;
	}
}

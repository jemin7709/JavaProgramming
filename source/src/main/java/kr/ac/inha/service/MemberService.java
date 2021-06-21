package kr.ac.inha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.inha.dto.MemberDto;
import kr.ac.inha.mapper.MemberMapper;

@Service
public class MemberService {
	@Autowired
	MemberMapper mapper;
	
	public int signUp(MemberDto memberDto) throws Exception{
		return mapper.signUp(memberDto);
	}
	public String logIn(String ID) throws Exception{
		return mapper.logIn(ID);
	}
	public void logOut() {}
	public int update(MemberDto memberDto) throws Exception{
		return mapper.update(memberDto);
	}
	public MemberDto getMember(String ID) throws Exception{
		return mapper.getMember(ID);
	}
	public int delete(String ID) throws Exception{
		return mapper.delete(ID);
	}
}

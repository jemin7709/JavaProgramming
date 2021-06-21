package kr.ac.inha.mapper;

import kr.ac.inha.dto.MemberDto;

public interface MemberMapper {
	public int signUp(MemberDto memberDto) throws Exception;
	public String logIn(String ID) throws Exception;
	public int update(MemberDto memberDto) throws Exception;
	public MemberDto getMember(String ID) throws Exception;
	public int delete(String ID) throws Exception;
}

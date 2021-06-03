package kr.ac.inha.mvc.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.inha.mvc.mapper.JspMapper;

@Service
public class JspService {
	int count = 0;
	
	@Autowired
	JspMapper mapper;
	public String count() {
		return count++ + "";
	}
	
	public List<?> boardList() throws Exception{
		return mapper.boardList();
	}
	
	public int regitSubject(HashMap<String, String> hashmap) throws Exception{
		return mapper.regitSubject(hashmap);
	}
}

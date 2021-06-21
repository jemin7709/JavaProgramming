package kr.ac.inha.mvc.mapper;

import java.util.HashMap;
import java.util.List;

public interface JspMapper {
	public List<?> boardList() throws Exception;
	public int regitSubject(HashMap<String, String> hashmap) throws Exception;
}

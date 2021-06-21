package kr.ac.inha.dto;

public class MemberDto {
	String ID;
	String PW;
	String NICKNAME;
	String NAME;
	String MAIL;
	String HELLO;
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPW() {
		return PW;
	}
	public void setPW(String pW) {
		PW = pW;
	}
	public String getNICKNAME() {
		return NICKNAME;
	}
	public void setNICKNAME(String nICKNAME) {
		NICKNAME = nICKNAME;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getMAIL() {
		return MAIL;
	}
	public void setMAIL(String mAIL) {
		MAIL = mAIL;
	}
	public String getHELLO() {
		return HELLO;
	}
	public void setHELLO(String hELLO) {
		HELLO = hELLO;
	}
}

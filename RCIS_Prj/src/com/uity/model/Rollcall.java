	package com.uity.model;

import java.util.List;

public class Rollcall {
	private String rollno;
	private String name;
	private Double se_eng;
	private Double se_501;
	private Double se_502;
	private Double se_503;
	private Double se_504;
	private Double se_505;
	private Double se_506;
	private List<Rollcall> rcList;
	private Output[] outputList;
	private Rollcall rollcall;

	public Rollcall getRollcall() {
		return rollcall;
	}

	public void setRollcall(Rollcall rollcall) {
		this.rollcall = rollcall;
	}

	public List<Rollcall> getRollcallList() {
		return rcList;
	}

	public void setRollcallList(List<Rollcall> rcList) {
		this.rcList = rcList;
	}

	public Rollcall() {
	}

	public Rollcall(String rollno,String name,Double se_eng,Double se_501,Double se_502,Double se_503,Double se_504,Double se_505,Double se_506 ) {
		this.rollno = rollno;
		this.name = name;
		this.se_eng = se_eng;
		this.se_501 = se_501;
		this.se_502 = se_502;
		this.se_503 = se_503;
		this.se_504 = se_504;
		this.se_505 = se_505;
		this.se_506 = se_506;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSe_eng() {
		return se_eng;
	}

	public void setSe_eng(Double se_eng) {
		this.se_eng = se_eng;
	}

	public Double getSe_501() {
		return se_501;
	}

	public void setSe_501(Double se_501) {
		this.se_501 = se_501;
	}

	public Double getSe_502() {
		return se_502;
	}

	public void setSe_502(Double se_502) {
		this.se_502 = se_502;
	}

	public Double getSe_503() {
		return se_503;
	}

	public void setSe_503(Double se_503) {
		this.se_503 = se_503;
	}

	public Double getSe_504() {
		return se_504;
	}

	public void setSe_504(Double se_504) {
		this.se_504 = se_504;
	}

	public Double getSe_505() {
		return se_505;
	}

	public void setSe_505(Double se_505) {
		this.se_505 = se_505;
	}

	public Double getSe_506() {
		return se_506;
	}

	public void setSe_506(Double se_506) {
		this.se_506 = se_506;
	}

	public Output[] getOutputList() {
		return outputList;
	}

	public void setOutputList(Output[] outputList) {
		this.outputList = outputList;
	}

}

package com.uity.dao;

import java.util.List;

import com.uity.model.Output;
import com.uity.model.Rollcall;




public interface RollcallDAO {
	
	public void delete(int studentId);
	
	public Rollcall get(int studentId);
	
	public List<Rollcall> list();

	public List<Rollcall> searchRC(String rollno);
	
	public List<Output> see5Algor(Rollcall rollcall);

}

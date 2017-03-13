package com.uity.dao;

import java.util.ArrayList;
import java.util.List;

import com.uity.model.Rollcall;




public interface RollcallDAO {
	
	public void delete(int studentId);
	
	public Rollcall get(int studentId);
	
	public List<Rollcall> list();

	public List<Rollcall> searchRC(String rollno);
	
	public ArrayList<String> see5Algor(Rollcall rollcall);

}

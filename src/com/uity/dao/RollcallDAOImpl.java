package com.uity.dao;


import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;


import org.springframework.stereotype.Repository;

import com.uity.model.Output;
import com.uity.model.Rollcall;

@Repository
public class RollcallDAOImpl implements RollcallDAO {

	  
	@Autowired(required=true) 
	 DataSource dataSource;
	

	@Override
	public List <Rollcall> list() {
		
		JdbcTemplate jdbcTemplateObject = new JdbcTemplate(dataSource);  
		String sql = "SELECT * FROM 5se_rc";
		
		List <Rollcall> listRollcall = jdbcTemplateObject.query(sql, new RollcallMapper());
		
		return listRollcall;
	}

	@Override
	public Rollcall get(int RollcallId) {
		JdbcTemplate jdbcTemplateObject = new JdbcTemplate(dataSource);  
		String sql = "SELECT * FROM 5se_rc WHERE student_id=" + RollcallId;
		List <Rollcall> lstRollcall = jdbcTemplateObject.query(sql, new RollcallMapper());
		
		return lstRollcall.get(0);
	}
	
	@Override
	public void delete(int studentId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Rollcall> searchRC(String rollno) {
		JdbcTemplate jdbcTemplateObject = new JdbcTemplate(dataSource);  
		String sql = "SELECT * FROM 5se_rc WHERE rollno='"+rollno+"'";
		
		List <Rollcall> listRollcall = jdbcTemplateObject.query(sql, new RollcallMapper());
		return listRollcall;
		
	}

	@Override
	public ArrayList<String> see5Algor(Rollcall rollcall) {
		// get a value of a subject
		List<Rollcall> rc = rollcall.getRollcallList();
		double se_eng = rc.get(0).getSe_eng();
		double se_501 = rc.get(0).getSe_501();
		double se_502 = rc.get(0).getSe_502();
		double se_503 = rc.get(0).getSe_503();
		double se_504 = rc.get(0).getSe_504();
		double se_505 = rc.get(0).getSe_505();
		double se_506 = rc.get(0).getSe_506();
		
		ArrayList <String> listOutput = new ArrayList<String>();
		ArrayList <Double> eachSub	= new ArrayList<Double>();
		//add return Result to output list
		String outputResult = "";
		int rMonth = 1;
		//String result pyan tae array output
//		if(se_501<75){
//			if(rMonth<=1){
//				outputResult = "Su Tg Nay Lite Dok";
//				listOutput.add(outputResult);
//			}
//			else if(rMonth>1){
//				outputResult = "Hme Tayy Tl Tat";
//				listOutput.add(outputResult);
//			}
//		}
//		else if(se_501>=75){
//			if(rMonth<=1){
//				outputResult = "Ah Sa Pl";
//				listOutput.add(outputResult);
//			}
//			else if(rMonth>1){
//				outputResult = "A Yann Tok M Pyat Nae Nor";
//				listOutput.add(outputResult);
//			}
//		}
		//end of reuslt string pyan tae har
		
		//missed class twat tr		
		double currentRC = se_eng;
		double denom = 100;
		double noOfClass = 16;
		double temp = 0;
		double missedClass = 0;
		
		temp = currentRC * noOfClass / denom;
		missedClass = Math.ceil(16-temp);
		
		outputResult = "You missed "+(int) missedClass+" Classes";
		listOutput.add(outputResult);
		listOutput.add("Test");
		
		return listOutput; 
		
	}
}

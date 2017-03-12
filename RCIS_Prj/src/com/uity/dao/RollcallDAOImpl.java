package com.uity.dao;


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
	public List<Output> see5Algor(Rollcall rollcall) {
		// get a value of a subject
		List<Rollcall> rc = rollcall.getRollcallList();	
		double se_501 = rc.get(0).getSe_501();
		
		//add return Result to output list
		String outputResult = "";
		if(se_501>=75){
			outputResult = "greater than 75";
			System.out.print(outputResult);
		}
		
		return null; 
		
	}
}

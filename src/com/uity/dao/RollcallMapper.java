package com.uity.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.uity.model.Rollcall;


public class RollcallMapper implements RowMapper<Rollcall>{

	@Override
	public Rollcall mapRow(ResultSet rs, int rowCount) throws SQLException {
		// TODO Auto-generated method stub
		Rollcall aRollcall = new Rollcall();
		
		aRollcall.setRollno(rs.getString("rollno"));
		aRollcall.setName(rs.getString("name"));
		aRollcall.setSe_eng(rs.getDouble("eng"));
		aRollcall.setSe_501(rs.getDouble("501"));
		aRollcall.setSe_502(rs.getDouble("502"));
		aRollcall.setSe_503(rs.getDouble("503"));
		aRollcall.setSe_504(rs.getDouble("504"));
		aRollcall.setSe_505(rs.getDouble("505"));
		aRollcall.setSe_506(rs.getDouble("506"));
		
		return aRollcall;
	}

}

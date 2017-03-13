package com.uity.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.uity.model.Output;

public class OutputMapper implements RowMapper<Output>{

	@Override
	public Output mapRow(ResultSet rs, int rowCount) throws SQLException {
		// TODO Auto-generated method stub
		Output aOutput = new Output();
		
		aOutput.setOutputFromAlgor(rs.getString("OutputFromAlgor"));
		
		return aOutput;
	}

}

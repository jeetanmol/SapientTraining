package com.training.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.training.domains.Invoice;

public class InvoiceRowMapper implements RowMapper<Invoice> {

	@Override
	public Invoice mapRow(ResultSet rs, int rowCount) throws SQLException {
		
		
		return null;
	}

}

package com.vetalent.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

//@Repository
@Repository("mysql")
//@Primary
public class MySqlReportImpl implements ReportDao {

	public MySqlReportImpl() {
		System.out.println("MySqlReportDaoImpl::Constructor.");
	}
	
	@Override
	public String findData() {
		System.out.println("Fetching Data from MySql DB.");
		return "Fetching Data";
	}

}

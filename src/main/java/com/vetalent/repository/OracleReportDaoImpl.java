package com.vetalent.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

//@Repository
@Repository("oracle")
//@Primary
public class OracleReportDaoImpl implements ReportDao {

	public OracleReportDaoImpl() {
		System.out.println("OracleReportDaoImpl::Constructor.");
	}
	
	@Override
	public String findData() {
		System.out.println("Fetching Data from Oracle DB.");
		return "Fetching Data";
	}

}

package com.vetalent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.vetalent.repository.ReportDao;

@Service
public class ReportService {
	
	
	//@Autowired
	private ReportDao reportDao;
	
	//@Autowired
	//@Qualifier("mysql")
	/*
	 * public void setReportDao(ReportDao reportDao) { this.reportDao = reportDao; }
	 */
	
	@Autowired
	public ReportService(@Qualifier("mysql") ReportDao reportDao) 
	{
		this.reportDao = reportDao;
	}
	
	public void generateReport()
	{
		reportDao.findData();
		System.out.println("Generating the Report..");
	}

}
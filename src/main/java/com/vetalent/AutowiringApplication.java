package com.vetalent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vetalent.service.ReportService;

@SpringBootApplication
public class AutowiringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AutowiringApplication.class, args);
		ReportService reportService = context.getBean(ReportService.class);
		reportService.generateReport();
		
	}

}

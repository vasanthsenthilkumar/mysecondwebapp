package com.fernbird;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class MysecondwebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysecondwebappApplication.class, args);
		Date date = new Date();
	    String Datein = "hh:mm:ss a";
	    DateFormat dateFormat = new SimpleDateFormat(Datein);
	    String formattedDate= dateFormat.format(date);
	    System.out.println("Current time " + formattedDate);
	}

}

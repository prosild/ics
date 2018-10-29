package com.ics.web;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class OracleTestConnectionTest {

	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String USER = "ics";
	private static final String PW = "1234";
	
	@Test
	public void testConnection() throws Exception {
		
		Class.forName(DRIVER);
		
		try (Connection conn = DriverManager.getConnection(URL, USER, PW)) {
			
			System.out.println("JUNIT: " + conn);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package com.crm.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;

/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// setup connection variables
		String user = "springstudent";
		String pass = "springstudent";
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String driver = "com.mysql.jdbc.Driver";
		
		// get connection to db
		try {
			PrintWriter out = response.getWriter();
			out.println("Connecting to db: " + jdbcUrl);
			Class.forName(driver);
			Connection myConn = (Connection) DriverManager.getConnection(jdbcUrl, user, pass);
			out.println("Success");
			myConn.close();
		} catch(Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}
	}

}

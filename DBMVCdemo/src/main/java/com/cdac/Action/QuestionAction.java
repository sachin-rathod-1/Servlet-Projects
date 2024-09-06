package com.cdac.Action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cdac.Beans.QuestionBeans;

public class QuestionAction {

	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private String sql = null;
	private int i = 0;

	public int addQuetion(Connection con, QuestionBeans qb) {
		try {
			sql = "INSERT INTO Quetions" + "(question, optiona, optionb, optionc, optiond, correctans,marks)"
					+ "VALUES(?,?,?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, qb.getQuestion());
			ps.setString(2, qb.getOptiona());
			ps.setString(3, qb.getOptionb());
			ps.setString(4, qb.getOptionc());
			ps.setString(5, qb.getOptiond());
			ps.setString(6, qb.getCorrectans());
			ps.setInt(7, qb.getMarks());

			i = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return i;
	}

	
	
	
	
	
	/*
	 * public ResultSet viewQuestion(Connection con) {
	 * 
	 * try { sql="SELECT * FROM Quetions"; ps=con.prepareStatement(sql);
	 * 
	 * } }
	 */

}

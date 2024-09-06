package com.cdac.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac.Action.QuestionAction;
import com.cdac.Beans.QuestionBeans;
import com.cdac.Connections.MyConnections;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out= response.getWriter();
		String question, optiona, optionb, optionc, optiond, correctans;
		int marks;
		
		if(request.getParameter("addquestion") != null) {
			question=request.getParameter("question");
			optiona=request.getParameter("optiona");
			optionb=request.getParameter("optionb");
			optionc=request.getParameter("optionc");
			optiond=request.getParameter("optiond");
			correctans=request.getParameter("correctans");
			marks=Integer.parseInt(request.getParameter("marks"));
			
			QuestionBeans qb = new QuestionBeans();
			qb.setQuestion(question);
			qb.setOptiona(optiona);
			qb.setOptionb(optionb);
			qb.setOptionc(optionc);
			qb.setOptiond(optiond);
			qb.setCorrectans(correctans);
			qb.setMarks(marks);
			
			MyConnections mcon= new MyConnections();
			Connection con=mcon.config();
			
			QuestionAction qa=new QuestionAction();
			int i=qa.addQuetion(con,qb);
			if(i>0) 
				out.println(" <script>alert('Question Added Succesfully')</script> ");
			else
				out.println(" <script>alert('No Question Added')</script> ");	
		
		}
		
	}

}

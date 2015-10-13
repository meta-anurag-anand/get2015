package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Name: Validation Check
 * @author anurag
 * Since: 12 October,2015
 * Description: Validation Check
 **/
public class ValidationCheck extends HttpServlet 
{
	/**
	 * Name: doGet
	 * @param req
	 * @param res
	 * @throws ServletException
	 * @throws IOException
	 * Description: Creates the Connection
	 **/
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException 
	{
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			out.println(req.getAttribute("result"));
	}
}
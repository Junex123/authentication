package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class authenticationservlet extends HttpServlet {
public  void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException{
	resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
	out.print("Welcome genius");
	out.close();
}
}

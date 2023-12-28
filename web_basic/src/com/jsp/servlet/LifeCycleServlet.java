package com.jsp.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/life/cycle")
public class LifeCycleServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().println("Get method");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().println("Post method");
	}

//		인스턴스가 생성되고 소멸될때 실행하기때문에 response와 request가 없다.
	@Override
	public void destroy() {
		System.out.println("destroy mehtod");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
//		최초에 인스턴스를 한번실행, init이 무거우면 응답이 늦을 수 있음.
		String param = config.getInitParameter("path");
		System.out.println("init param: " + param);
		System.out.println("init method");
	}

	

}

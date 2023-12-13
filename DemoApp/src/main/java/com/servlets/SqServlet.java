package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import org.apache.coyote.Request;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		int k =0;
		Cookie cookies[] = req.getCookies();
		for(Cookie c : cookies) {
			if(c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
			}
		}
		
		PrintWriter out = res.getWriter();
		out.println("sqServlet : " +k);
		
	
	}

}

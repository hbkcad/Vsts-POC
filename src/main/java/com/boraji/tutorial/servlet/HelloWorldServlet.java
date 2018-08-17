package com.boraji.tutorial.servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author imssbora
 */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

   private static final long serialVersionUID = 1L;
   int i=0;
   
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
         throws ServletException, IOException {
      resp.setContentType("text/plain");
	  System.out.println("commiting to get conflicts");
      resp.getWriter().write("Hello World! Maven Web Project Example.");
	  System.out.println("conflicts");
   }
}

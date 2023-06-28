package com.server.log;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//Logger is used to capture important runtime information, monitor the application's behavior.
import org.apache.logging.log4j.Logger;

//LogManager class in Log4j plays a vital role in managing and controlling the logging system within your Java application.
import org.apache.logging.log4j.LogManager;


public class CollectLog extends HttpServlet {

	private static final long serialVersionUID = 1L;
	static final Logger log = LogManager.getLogger();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out  =response.getWriter();
		out.println("\nWelcome");
		
        log.trace("Trace log Message");
        log.debug("Debug log Message");
        log.info("Info log Message");
        log.warn("Warn log Message");
        log.error("Error log Message");
        log.fatal("Fatal log Message");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

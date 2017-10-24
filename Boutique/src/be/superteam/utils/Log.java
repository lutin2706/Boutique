package be.superteam.utils;

import javax.servlet.http.HttpServletRequest;

public class Log {
	
	public static void logEntryInServlet(HttpServletRequest request) {
		System.out.println("----- Entry in " + request.getContextPath());

	}
}

package services;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AlphaFunqtions {

	private AlphaFunqtions() {
		// TODO Auto-generated constructor stub
	}

	public static void redirect(String location, HttpServletRequest request,
			HttpServletResponse response) {	
		RequestDispatcher dispatcher;
		dispatcher = request.getRequestDispatcher("/WEB-INF/views/" + location);
		try {
			dispatcher.forward(request, response);
		} catch (Exception e) {
			RequestDispatcher dispatcherEx;
			dispatcherEx = request
					.getRequestDispatcher("/WEB-INF/views/index.html");
		}
	}
	

}

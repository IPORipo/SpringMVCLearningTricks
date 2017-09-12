package services;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class RipExceptionHandler{
	
	@ExceptionHandler(Exception.class)
	public String ripExceptionHandler(Exception ex){
		
		return "exception_page";
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(NullPointerException.class)
	public String ripExceptionHandler2(Exception ex) {

		return "exception_page2";
	}
}

package services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class RipPreHandleInterceptoor extends HandlerInterceptorAdapter {

	/* aucilebelia am metodis override rom shevdzlot request-is damushaveba */
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object object) throws Exception {

//		AlphaFunqtions.redirect("error.jsp", request, response);
//		return false;
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest reques,
			HttpServletResponse response, Object object, ModelAndView model)
			throws Exception {

		System.out.println("postHandle");

	}

	@Override
	public void afterCompletion(HttpServletRequest reques,
			HttpServletResponse response, Object object, Exception ex)
			throws Exception {

		System.out.println("afterHandle");

	}

}

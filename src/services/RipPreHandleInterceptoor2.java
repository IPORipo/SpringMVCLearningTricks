package services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class RipPreHandleInterceptoor2 extends HandlerInterceptorAdapter {

	/*aucilebelia am metodis override rom shevdzlot request-is damushaveba*/
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object object) throws Exception {

		AlphaFunqtions.redirect("error2.jsp", request, response);
		return false;

	}

}

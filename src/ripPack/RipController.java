package ripPack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;




public class RipController extends AbstractController{
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView model = new ModelAndView("home");
		model.addObject("ripValue","ripo");
		DispatcherServlet s=new DispatcherServlet();
		return model;
	}

}

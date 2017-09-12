package controllers;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import services.Address;
import services.RipPropertyEditor;
import services.Student;

@RequestMapping("/rip")
@Controller
public class AnotatedController {

	@ModelAttribute
	public void myfunq(Model m) {
		m.addAttribute("ripHeader", "es aris headeri");
		m.addAttribute("msg", "rip2 ");
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {

		//es metodi ert veltan samushaod gamodgeba(gamoiyeneba imistvis rom parametrad gadacemuli velis bindingi ar moxdes anu gamotovos )
		//binder.setDisallowedFields("name");

		//am metodit ertdroulad ramenime veltan shegvizlia mushaoba
		//		binder.setDisallowedFields(new String[] { "name" });

		binder.registerCustomEditor(String.class, "name",
				new RipPropertyEditor());

	}

	@RequestMapping("/rom/{name}/{surename}")
	//	public ModelAndView hi(@PathVariable("name") String name, @PathVariable("surename") String surename){
	public ModelAndView hi(@PathVariable Map<String, String> vars) {
		String rname = vars.get("name");
		String rsurename = vars.get("surename");

		ModelAndView model = new ModelAndView("home");
		model.addObject("msg", "name " + rname + " surename " + rsurename);
		return model;
	}

	@RequestMapping(value = "/rip2", method = RequestMethod.GET)
	public ModelAndView method2(
			@RequestParam("ripName") String name,
			@RequestParam(value = "ripSurename", defaultValue = "ripDefault") String surename) {

		if (name.equals("rip")) {
			throw new NullPointerException("ripMessageexeption");
		}

		ModelAndView model = new ModelAndView("home");
		model.addObject("msg", "rip2 ");
		return model;
	}

	/* Exception handling nothing to do in spring dispatcher */

	/*
	 * tu konkretuli Exception handler klasi ar moidzebna mashin es zogadi
	 * damushavdeba
	 */

	/*
	 * Controlleris klashi gaweril Exceptionebs upiratesoba enichebat anu tu
	 * zogad klashic gvaqvs igive Exceptionis dammushavebeli metdoi konkretuli
	 * controleris gamoidzaxeba da ara zogadi
	 */

	//	@ExceptionHandler(Exception.class)
	//	public String ripExceptionHandler(Exception ex){
	//		
	//		return "exception_page";
	//	}
	//
	//	
	//	
	//	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	//	@ExceptionHandler(NullPointerException.class)
	//	public String ripExceptionHandler2(Exception ex) {
	//
	//		return "exception_page2";
	//	}

	/*-----------------------------------------------------*/

	@RequestMapping(value = "/rip3", method = RequestMethod.GET)
	public ModelAndView method3(@RequestParam Map<String, String> params) {

		String name = params.get("name");

		ModelAndView model = new ModelAndView("home");
		model.addObject("msg", "rip2 ");
		return model;
	}

	@RequestMapping(value = "/rip4", method = RequestMethod.GET)
	public ModelAndView method4(
			@Valid @ModelAttribute("student") Student student,
			BindingResult bindResult) {
		//	public ModelAndView method4(Student student){
		if (bindResult.hasErrors()) {
			ModelAndView model = new ModelAndView("home");
			return model;
		}

		ModelAndView model = new ModelAndView("home");
		//		model.addObject("student",student);
		return model;
	}


	
	
	
	
	
	
	

}
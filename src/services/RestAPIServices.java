package services;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//am anotacit monishvnis shemtxvevasi tvitoeul metods agar chirdeba  @ResponseBody anotaciis mititeb 
//RestController igivea rom erTdroulad @Controller da @ResponseBody gamoviyenot ertad

//@Controller
//@ResponseBody
@RestController
public class RestAPIServices {
	/*------------------------Rest Services-----------------------------*/
	//	@ResponseBody
	//produces-zgudavs response-s tips (Accept) anu shegvidzlia mivutitot metods rom mxolod xml forma
	//consumes-zgudavs request-s tips (Content-Type) anu shegvidzlia mivutitot metods rom mxolod xml forma
	@RequestMapping(value = "/students", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public Student getStudent() {

		Student student = new Student();
		Address adress = new Address();
		adress.setCity("telavi");
		adress.setCountry("Georgia");
		//		adress.setZipcode(5);

		student.setName("roma");
		student.setSurename("sumbadze");
		student.setAddress(adress);

		return student;
	}

	/*------------------------Get Request-----------------------------*/
	//	@ResponseBody
	@RequestMapping(value = "/students/{name}", method = RequestMethod.GET)
	public Student getStudentByName(@PathVariable("name") String name) {

		Student student = new Student();
		Address adress = new Address();
		adress.setCity("telavi");
		adress.setCountry("Georgia");
		//		adress.setZipcode(5);

		student.setName(name);
		student.setSurename("sumbadze");
		student.setAddress(adress);

		return student;
	}

	/*------------------------Put Request-----------------------------*/
	//reading info from request(HTTP header)
	//Request body-s meshveobit xdeba contentis tipis amocnoba da shemdegi shesabamisi jar-ebis meshveobid formatireba da binding
	@RequestMapping(value = "/students/{name}", method = RequestMethod.PUT)
	public ResponseEntity<Boolean> hi(@PathVariable("name") String name,
			@RequestBody Student student) {

		System.out.println(student.getName());
		System.out.println(student.getSurename());

		HttpHeaders headers= new HttpHeaders();
		headers.add("Key1", "Val1");
		headers.add("Key2", "Val2");
		
		//status codisa da boolis ertdroulad dabruneba
		return new ResponseEntity<Boolean>(true,headers,HttpStatus.NOT_FOUND);
	}

	/*------------------------Delete Request-----------------------------*/
	//reading info from request(HTTP header)
	//Request body-s meshveobit xdeba contentis tipis amocnoba da shemdegi shesabamisi jar-ebis meshveobid formatireba da binding
	@RequestMapping(value = "/students/{name}", method = RequestMethod.PUT)
	public ResponseEntity<Boolean> delete(@PathVariable("name") String name,
			@RequestBody Student student) {
		
		System.out.println(student.getName());
		System.out.println(student.getSurename());
		
		//status codisa da boolis ertdroulad dabruneba
		return new ResponseEntity<Boolean>(true,HttpStatus.NOT_FOUND);
	}

}

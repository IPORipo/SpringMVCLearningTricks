package services;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<isValidHobby,String>{

	private String hobbysAloowed;
	
	@Override
	public void initialize(isValidHobby arg0) {
		// TODO Auto-generated method stub
		hobbysAloowed = arg0.hobbysAllowed();
	}

	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		
		if(arg0.equals("Mr"+hobbysAloowed)){
			return true;
		}
		 
		return false;
	}
	

}

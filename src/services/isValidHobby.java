package services;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;

import org.springframework.messaging.handler.annotation.Payload;


@Constraint(validatedBy=HobbyValidator.class)

/*aucilebeli anotaciebia ristvisaa ar vici*/
@Documented
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface isValidHobby {

	
	
	String hobbysAllowed()default "Footbal";
	String hobbysAllowed2()default "Footbal";
	String message()default "please chose correct hobby";
	
	/*aucilebeli velebia ristvisaa sachiro ar vici*/
	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default {};
	
	
}

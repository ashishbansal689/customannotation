package com.threadminions.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/***
 * Custom annotations {@code SupportedValues}<br>
 * Used for specifying list of supported values for a particular property or method of a {@code Bean}
 * @author THREADMINIONS
 */

@Retention(RetentionPolicy.RUNTIME) //Annotation will work at RUNTIME
@Target(value = {ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER}) //Annotation can be applied either on METHOD or on FIELD
@Constraint(validatedBy = CustomValidator.class) //CustomValidator class will validate the values
public @interface SupportedValues 
{
	String message() default "Values are not supported";
	
	String[] values();
	
	Class<?>[] groups() default {}; //Required by Constraint
	
	Class<? extends Payload>[] payload() default {}; //Required by Constraint
}

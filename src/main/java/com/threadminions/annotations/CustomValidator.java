package com.threadminions.annotations;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/***
 * Custom validator class to validate custom annotation {@code SupportedValues}
 * 
 * @author THREADMINIONS
 *
 */
public class CustomValidator implements ConstraintValidator<SupportedValues, String>{

	public String message;
	public String[] values;
	
	@Override
	public void initialize(SupportedValues supportedValues) 
	{
		this.message = supportedValues.message();
		this.values = supportedValues.values();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext arg1) 
	{
		List<String> lstValues = Arrays.asList(values);
		
		return value != null && !value.isEmpty() && lstValues.contains(value);
	}

}

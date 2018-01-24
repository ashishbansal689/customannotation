package com.threadminions;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.threadminions.model.ConfigProp;

@SpringBootApplication
public class SpringBootMain implements CommandLineRunner
{
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMain.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{

		String dbType = "POSTGRES";
		
		ConfigProp property = new ConfigProp();
		property.setDbType(dbType);//setting unsupported values here
		
		//Inbuilt class that is used to validate data
		ValidatorFactory validator = Validation.buildDefaultValidatorFactory();
		Set<ConstraintViolation<ConfigProp>> validationErrors = validator.getValidator().validate(property);
		if(!validationErrors.isEmpty()) //If there are some errors then print those
		{
			for(ConstraintViolation<ConfigProp> invalidObj : validationErrors)
			{
				System.out.println(invalidObj.getMessage());
			}
		}
		
	}
	
	
}

package com.bridgelabz.userregistration.operation;

import java.util.Arrays;
import java.util.Collection;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



import com.bridgelabz.userregistration.EmailParameterized;


@RunWith(Parameterized.class)
public class EmailParameterizedTest {
	private String email;
	private boolean result;
	private EmailParameterized emailParameterized;
	
	public EmailParameterizedTest(String email,boolean result) {
		this.email=email;
		this.result=result;
	}
	@Before
	public void initialize() {
		emailParameterized=new EmailParameterized();
	}
	
	@Parameterized.Parameters
	public static Collection emailInput() {
		return Arrays.asList(new Object[][]{
			{"abc@yahoo.com",true},
			{"abc-100@yahoo.com",true},
			{"abc.100@yahoo.com",true},
			{"abc.111@yahoo.com",true},
			{"abc-100@yahoo.com",true},
			{"abc.100@yahoo.com.au",true},
			{"abc@1.com",true},
			{"abc@gmail.com.com",true},
			{"abc+100@gmail.com",true},
			{"abc",false},
			{"abc@.com.my",false},
			{"abc123@gmail.a",false},
			{"abc123@.com",false},
			{"abc123@.com.com",false},
			{".abc@abc.com",false},
			{"abc()*@gmail.com",false},
			{"abc@%*.com",false}, 
			{"abc...2002@gmail.com",false},
			{"abc.@gmail.com",false},
			{"abc@abc@gmail.com",false},
			{"abc@gmail.com.1a",false},
			{"abc@gmail.com.aa.au",false}
			});

	}

	@Test
	public void giveEmail_AsperInput_ShouldReturnResult() {
		System.out.println(email+result);
		Assert.assertEquals(result,emailParameterized.validateEmail(email));
	}

}

package com.bridgelabz.userregistration.operation;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


import com.bridgelabz.userregistration.EmailParameterized;
import com.bridgelabz.userregistration.UserRegistration;

@RunWith(Parameterized.class)
public class EmailParameterizedTest {
	
	@Test
	public void giveEmail_whenProper_ShouldReturnTrue(String email) {
		EmailParameterized validater = new EmailParameterized();
		boolean result = validater.validateEmail("Patil");
		Assert.assertTrue(result);
	}
	@Test
	public void giveEmail_whenNotProper_ShouldReturnFalse(String email) {
		EmailParameterized validater = new EmailParameterized();
		boolean result = validater.validateEmail("Patil");
		Assert.assertFalse(result);
	}

	public static List<String> validEmail() {
		return Arrays.asList("abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc.111@yahoo.com",
				"abc-100@yahoo.com", "abc.100@yahoo.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com");

	}

	public static List<String> invalidEmail() {
		return Arrays.asList("abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com",
				"abc()*@gmail.com", "abc@%*.com", "abc...2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com",
				"abc@gmail.com.1a", "abc@gmail.com.aa.au");

	}

}

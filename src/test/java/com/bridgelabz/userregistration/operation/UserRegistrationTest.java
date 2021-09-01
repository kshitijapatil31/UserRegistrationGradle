package com.bridgelabz.userregistration.operation;

import org.junit.Test;

import com.bridgelabz.userregistration.UserRegistration;
import com.bridgelabz.userregistration.ValidationException;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

public class UserRegistrationTest {

	
	/*@Test
	public void giveFirstName_whenProper_ShouldReturnTrue() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validateFirstName("Kshitija");
		Assert.assertEquals(true, result);
	}
	@Test
	public void giveFirstName_whenNameNotEnter_ShouldReturnFalse() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validateFirstName("");
		Assert.assertEquals(false, result);
	}
	@Test
	public void giveFirstName_whenShort_ShouldReturnFalse() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validateFirstName("Ksh");
		Assert.assertEquals(false, result);
	}
	@Test
	public void giveFirstName_whenspecialChar_ShouldReturnFalse() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validateFirstName("K$h");
		Assert.assertEquals(false, result);
	}
	@Test
	public void giveFirstName_whenbetweencaps_ShouldReturnFalse() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validateFirstName("KshiTija");
		Assert.assertEquals(false, result);
	}
	@Test
	public void giveFirstName_whenNumber_ShouldReturnFalse() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validateFirstName("Ksh31Tija");
		Assert.assertEquals(false, result);
	}
	/**lastname**/
	/*@Test
	public void giveLastName_whenProper_ShouldReturnTrue() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validateLastName("Patil");
		Assert.assertEquals(true, result);
	}
	@Test
	public void giveLastName_whenShort_ShouldReturnFalse() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validateLastName("Pa");
		Assert.assertEquals(false, result);
	}
	@Test
	public void giveLastName_whenEnterNumber_ShouldReturnFalse() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validateLastName("Patil31");
		Assert.assertEquals(false, result);
	}
	@Test
	public void giveLastName_whenEnterCapsBetween_ShouldReturnFalse() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validateLastName("PaTil31");
		Assert.assertEquals(false, result);
	}
	@Test
	public void giveLastName_whenEnterSpaceBetween_ShouldReturnFalse() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validateLastName("PaT il31");
		Assert.assertEquals(false, result);
	}
	@Test
	public void giveLastName_whenEnterSpecialChar_ShouldReturnFalse() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validateLastName("Pa@il");
		Assert.assertEquals(false, result);
	}
	/**Email**/
   /* @Test
	public void giveEmail_whenProper_ShouldReturnTrue() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validateEmail("abc.xyz@bridgelabz.co.in");
		Assert.assertEquals(true, result);
	}
    /**Mobile**/
	/*@Test
	public void giveMobile_whenProper_ShouldReturnTrue() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validateMobile("+91 9919819801");
		Assert.assertTrue(result);
	}
	@Test
	public void giveMobile_whenShort_ShouldReturnFalse() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validateMobile("+91 99198");
		Assert.assertFalse(result);
	}
	@Test
	public void giveMobile_whenSpclChar_ShouldReturnFalse() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validateMobile("+91 99@9801198");
		Assert.assertFalse(result);
	}
	@Test
	public void giveMobile_whenToLong_ShouldReturnFalse() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validateMobile("+91 9909801198456");
		Assert.assertFalse(result);
	}
	/**PASSWORD**/
	/*s@Test
	public void givePassword_whenProper_ShouldReturnTrue() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validatePassword("Morningstar@31");
		Assert.assertTrue(result);
	}
	@Test
	public void givePassword_whenNOCaps_ShouldReturnFalse() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validatePassword("morningstar@31");
		Assert.assertFalse(result);
	}
	@Test
	public void givePassword_whenNOShort_ShouldReturnFalse() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validatePassword("morning");
		Assert.assertFalse(result);
	}
	@Test
	public void givePassword_whenNOSpclChar_ShouldReturnFalse() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validatePassword("morningstar31");
		Assert.assertFalse(result);
	}
	@Test
	public void givePassword_whenNONumber_ShouldReturnFalse() {
		UserRegistration validater=new UserRegistration();
		boolean result=validater.validatePassword("morningstar@");
		Assert.assertFalse(result);
	}*/
	
	/**custom exception**/
	
	//first name
	
	@Test
	public void givenFirstName_whenProper_shouldThrowException() {
		UserRegistration validater=new UserRegistration();
		String custom;
		try {
			custom=validater.validateFirstName1("Kshtija31");
		}catch(ValidationException e) {
			assertEquals("valid firstName ",e.getMessage());
			
		}
	}
	@Test
	public void givenFirstName_whenNull_shouldThrowException() {
		UserRegistration validater=new UserRegistration();
		String custom;
		try {
			custom=validater.validateFirstName1(null);
		}catch(ValidationException e) {
			assertEquals("firstName cannot be null",e.getMessage());
			
		}
	}
	
	@Test
	public void givenFirstName_whenEmpty_shouldThrowException() {
		UserRegistration validater=new UserRegistration();
		String custom;
		try {
			custom=validater.validateFirstName1("");
		}catch(ValidationException e) {
			assertEquals("firstName cannot be empty",e.getMessage());
			
		}
	}
	@Test
	public void givenFirstName_whenToShort_shouldThrowException() {
		UserRegistration validater=new UserRegistration();
		String custom;
		try {
			custom=validater.validateFirstName1("ksh");
		}catch(ValidationException e) {
			assertEquals("firstName cannot be empty",e.getMessage());
			
		}
	}
	
	@Test
	public void givenFirstName_whenSpclChar_shouldThrowException() {
		UserRegistration validater=new UserRegistration();
		String custom;
		try {
			custom=validater.validateFirstName1("Kshtija@");
		}catch(ValidationException e) {
			assertEquals("invalid firstName ",e.getMessage());
			
		}
	}
	@Test
	public void givenFirstName_whenNumber_shouldThrowException() {
		UserRegistration validater=new UserRegistration();
		String custom;
		try {
			custom=validater.validateFirstName1("Kshtija31");
		}catch(ValidationException e) {
			assertEquals("invalid firstName ",e.getMessage());
			
		}
	}
	
	
	//last name
	
		@Test
		public void givenLastName_whenProper_shouldThrowException() {
			UserRegistration validater=new UserRegistration();
			String custom;
			try {
				custom=validater.validateLastName1("Patil");
			}catch(ValidationException e) {
				assertEquals("valid lastName ",e.getMessage());
				
			}
		}
		@Test
		public void givenLastName_whenNull_shouldThrowException() {
			UserRegistration validater=new UserRegistration();
			String custom;
			try {
				custom=validater.validateLastName1(null);
			}catch(ValidationException e) {
				assertEquals("lastName cannot be null",e.getMessage());
				
			}
		}
		
		@Test
		public void givenLastName_whenEmpty_shouldThrowException() {
			UserRegistration validater=new UserRegistration();
			String custom;
			try {
				custom=validater.validateLastName1("");
			}catch(ValidationException e) {
				assertEquals("lastName cannot be empty",e.getMessage());
				
			}
		}
		@Test
		public void givenLastName_whenToShort_shouldThrowException() {
			UserRegistration validater=new UserRegistration();
			String custom;
			try {
				custom=validater.validateLastName1("pat");
			}catch(ValidationException e) {
				assertEquals("invalid lastname",e.getMessage());
				
			}
		}
		
		@Test
		public void givenLastName_whenSpclChar_shouldThrowException() {
			UserRegistration validater=new UserRegistration();
			String custom;
			try {
				custom=validater.validateLastName1("Patil@");
			}catch(ValidationException e) {
				assertEquals("invalid lastname",e.getMessage());
				
			}
		}
		@Test
		public void givenLastName_whenNumber_shouldThrowException() {
			UserRegistration validater=new UserRegistration();
			String custom;
			try {
				custom=validater.validateLastName1("Patil31");
			}catch(ValidationException e) {
				assertEquals("invalid lastname",e.getMessage());
				
			}
		}
		//mobile
		
			@Test
			public void givenMobile_whenProper_shouldThrowException() {
				UserRegistration validater=new UserRegistration();
				String custom;
				try {
					custom=validater.validateMobile1("+91 9919819801");
				}catch(ValidationException e) {
					assertEquals("valid Mobile ",e.getMessage());
					
				}
			}
			@Test
			public void givenMobile_whenNull_shouldThrowException() {
				UserRegistration validater=new UserRegistration();
				String custom;
				try {
					custom=validater.validateMobile1(null);
				}catch(ValidationException e) {
					assertEquals("Mobile cannot be null",e.getMessage());
					
				}
			}
			
			@Test
			public void givenMobile_whenEmpty_shouldThrowException() {
				UserRegistration validater=new UserRegistration();
				String custom;
				try {
					custom=validater.validateMobile1("");
				}catch(ValidationException e) {
					assertEquals("Mobile cannot be empty",e.getMessage());
					
				}
			}
			@Test
			public void givenMobile_whenToShort_shouldThrowException() {
				UserRegistration validater=new UserRegistration();
				String custom;
				try {
					custom=validater.validateMobile1("+91 991981");
				}catch(ValidationException e) {
					assertEquals("invalid Mobile",e.getMessage());
					
				}
			}
			
			@Test
			public void givenMobile_whenSpclChar_shouldThrowException() {
				UserRegistration validater=new UserRegistration();
				String custom;
				try {
					custom=validater.validateMobile1("+91 991@819801");
				}catch(ValidationException e) {
					assertEquals("invalid Mobile",e.getMessage());
					
				}
			}
			@Test
			public void givenMobile_whenCharacter_shouldThrowException() {
				UserRegistration validater=new UserRegistration();
				String custom;
				try {
					custom=validater.validateMobile1("+91 991K819801");
				}catch(ValidationException e) {
					assertEquals("invalid Mobile",e.getMessage());
					
				}
			}
		//Email
		
			@Test
			public void givenEmail_whenProper_shouldThrowException() {
				UserRegistration validater=new UserRegistration();
				String custom;
				try {
					custom=validater.validateEmail1("abc.xyz@bridgelabz.co.in");
				}catch(ValidationException e) {
					assertEquals("valid Email ",e.getMessage());
					
				}
			}
			@Test
			public void givenEmail_whenNull_shouldThrowException() {
				UserRegistration validater=new UserRegistration();
				String custom;
				try {
					custom=validater.validateEmail1(null);
				}catch(ValidationException e) {
					assertEquals("Email cannot be null",e.getMessage());
					
				}
			}
			
			@Test
			public void givenEmail_whenEmpty_shouldThrowException() {
				UserRegistration validater=new UserRegistration();
				String custom;
				try {
					custom=validater.validateEmail1("");
				}catch(ValidationException e) {
					assertEquals("Email cannot be empty",e.getMessage());
					
				}
			}
			@Test
			public void givenEmail_whenToShort_shouldThrowException() {
				UserRegistration validater=new UserRegistration();
				String custom;
				try {
					custom=validater.validateEmail1("abc");
				}catch(ValidationException e) {
					assertEquals("invalid Email",e.getMessage());
					
				}
			}
			
			@Test
			public void givenEmail_whenNOSpclChar_shouldThrowException() {
				UserRegistration validater=new UserRegistration();
				String custom;
				try {
					custom=validater.validateEmail1("abc@gmail.com.co");
				}catch(ValidationException e) {
					assertEquals("invalid Email",e.getMessage());
					
				}
			}
			@Test
			public void givenEmail_whenNumber_shouldThrowException() {
				UserRegistration validater=new UserRegistration();
				String custom;
				try {
					custom=validater.validateEmail1("Patil31");
				}catch(ValidationException e) {
					assertEquals("invalid Email",e.getMessage());
					
				}
			}
}

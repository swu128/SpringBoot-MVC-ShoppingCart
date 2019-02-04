package com.project;

import java.util.Arrays;

/*Stephen Wu
 *
 * Helper class to handle all of the validation logic required along with discount calculations*/

public abstract class Logic {

	//Validation 2.1 - given a domain, verify if it ends with a valid TLD exclusively
	public static boolean validateTLD (String userDomain){

		int index=userDomain.lastIndexOf('.');
		if(index<0)
			return false;

		String[] validTLD = {".com", ".net", ".org", ".info"};
		String userDomainTLD = userDomain.substring(index,userDomain.length()).toLowerCase();

		return Arrays.asList(validTLD).contains(userDomainTLD);
	}

	//Validation 2.2 - given a domain, verify if SLD is specifically 63 characters or less
	public static boolean validateSLDLength (String userDomain){


		int index=userDomain.lastIndexOf('.');
		String userDomainSLD = userDomain.substring(0, index);

		return userDomainSLD.length() <= 63;
	}

	//Validation 2.3 - given a domain, verify if SLD only contains numbers, letters, and dashes
	public static boolean validateSLDCharacters (String userDomain){


		int index=userDomain.lastIndexOf('.');
		String userDomainSLD = userDomain.substring(0, index);

		String regex = "[0-9A-Za-z\\-]+";
		return userDomainSLD.matches(regex);
	}

	//Validation 3 Discount Logic - Given quantity and base price of a TLD, return calculated sub-total
	public static double calculateSubTotal (int quantity, double basePrice){

		//For each of the 4 TLDs, use formulas below.  OR if you pass in TLD as param, just change below to
		//be gated by each TLD respectively
		double subTotal = 0;

		//.com
		if(quantity >= 3)
			subTotal = (quantity / 3 * 45.99) + (quantity % 3 * basePrice);
		else
			subTotal = quantity * basePrice;

		//.net
		if(quantity >= 10)
			subTotal = (quantity / 10 * 79.99) + (quantity % 10 * basePrice);
		else
			subTotal = quantity * basePrice;

		//.org
		if(quantity >= 3)
			subTotal = (quantity / 3 * 29.99) + (quantity % 3 * basePrice);
		else
			subTotal = quantity * basePrice;

		//.info
			subTotal = quantity * basePrice;

		return subTotal;
	}

	public static void main(String [] args)
	{
		//stehen wu - testing
		String userDomain = "YOUR_USER_INPUT_TESTING_HERE.com";
		int quantity = 99;
		double basePrice = 11.25;


		System.out.println(validateSLDCharacters(userDomain));
	}
}

package assertionConcept;

import org.testng.Assert;

public class HardAssertion {

	public static void main(String[] args) {
		
		int actual=20;
		int expected=10;
		
	System.out.println("Actual is:"+actual +"and Expected is:"+expected);
	
		Assert.assertEquals(actual, expected,"Not matched");
		System.out.println("It's Matched");
	}

}

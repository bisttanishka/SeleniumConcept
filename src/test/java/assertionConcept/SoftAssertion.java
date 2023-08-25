package assertionConcept;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	public static void main(String[] args) {
		
		int actual=20;
		int expected=10;
		SoftAssert softassert=new SoftAssert();
		
		
	System.out.println("Actual is:"+actual +"and Expected is:"+expected);
	
		softassert.assertEquals(actual, expected,"Not matched");
		System.out.println("It's not Matched");

	}

}

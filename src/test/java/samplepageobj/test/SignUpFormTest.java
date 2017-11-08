package samplepageobj.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import samplepageobj.pages.ReceiptPage;
import samplepageobj.pages.SignUpPage;

public class SignUpFormTest extends FunctionalTest {

	@Test
	public void signUp(){
		driver.get("http://www.kimschiller.com/page-object-pattern-tutorial/index.html");
		
		SignUpPage signUpPage = PageFactory.initElements(driver,SignUpPage.class);
//				SignupPage signUpPage= new SignUpPage(driver);
		assertTrue(signUpPage.isInitialized());

		signUpPage.enterName("First", "Last");
		signUpPage.enterAddress("123 Street", "12345");

		ReceiptPage receiptPage = signUpPage.submit();
		assertTrue(receiptPage.isInitialized());

		assertEquals("Thank you!", receiptPage.confirmationHeader());
	}	
}
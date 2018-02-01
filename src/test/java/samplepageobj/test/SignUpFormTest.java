package samplepageobj.test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import samplepageobj.pages.ReceiptPage;
import samplepageobj.pages.SignUpPage;

public class SignUpFormTest extends FunctionalTest {

	@Test
	public void signUp(){
		driver.get("http://www.kimschiller.com/page-object-pattern-tutorial/index.html");
		
		SignUpPage signUpPage= PageFactory.initElements(driver,SignUpPage.class);
		assertTrue(signUpPage.isInitialized());

		signUpPage.enterName("First", "Last");
		signUpPage.enterAddress("123 Street", "12345");

		signUpPage.submit();
	//	assertTrue(receiptPage.isInitialized());

	//	assertEquals("Thank you!", receiptPage.confirmationHeader());
	}	
}
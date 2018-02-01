package samplepageobj.pages;
//Test Pull
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReceiptPage {

	@FindBy(tagName = "h1")
	private WebElement header;
	

	public boolean isInitialized() {
		return header.isDisplayed();
	}

	public String confirmationHeader(){
		return header.getText();
	}

}

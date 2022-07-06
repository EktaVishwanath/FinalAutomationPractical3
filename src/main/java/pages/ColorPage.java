package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ColorPage {
	
	WebDriver driver;
	
	public ColorPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set SkyBlue Background')]") WebElement SKY_BLUE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//body") WebElement HTML_BODY;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set White Background')]") WebElement WHITE_ELEMENT;
	
	
	//Blue Background
	public String checkIfSkyBlueButtonExists () {
		return SKY_BLUE_ELEMENT.getText();
	}
	public void clickOnSetSkyBlueBackGround() {
		SKY_BLUE_ELEMENT.click();
	}
	public String checkIfBackGroundIsBlue() {
		return HTML_BODY.getCssValue("background-color");
	}
	
	//White background
	public String checkIfWhiteBackgroundButtonExists() {
		return WHITE_ELEMENT.getText();
	}
	
	public void clickOnSetWhiteBackGround() {
		WHITE_ELEMENT.click();
	}
	
	public String checkIfBackGroundIsWhite() {
		return HTML_BODY.getCssValue("background-color");
	}
	
}

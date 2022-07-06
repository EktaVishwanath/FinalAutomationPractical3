package steps;

import java.io.IOException;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.ColorPage;
import pages.TestBase;

public class BackGroundStepDefination extends TestBase {
	ColorPage colorPageObj;
	
	@Before
	public void berforeRun() {
		initDriver();
		colorPageObj = PageFactory.initElements(driver, ColorPage.class);
	}
	
	
	//Blue Background Methods
	@Given("^User is on techfios test page$")
	public void user_is_on_techfios_test_page() {
		driver.get("https://techfios.com/test/103/");
	}
	
	@When ("^Set skyblue background button exists$")
	public void set_skyBlue_background_button_exists() {
		Assert.assertEquals("Button is not exists!!!", "Set SkyBlue Background", colorPageObj.checkIfSkyBlueButtonExists());
	}
	
	@When("^I click on skyblue background button$")
	public void i_click_on_skyblue_background_button() {
		colorPageObj.clickOnSetSkyBlueBackGround();
	}

	@Then("^The background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() throws WebDriverException, IOException {
		Assert.assertEquals("Background color is not changed!!!", "rgba(135, 206, 235, 1)", colorPageObj.checkIfBackGroundIsBlue());
		takeScreenshot(driver);
	}
	
	//White Background Methods
	
	@Given("^Set white background button exists$")
	public void set_white_background_button_exists() {
	    Assert.assertEquals("Button is not exists!!!", "Set White Background", colorPageObj.checkIfWhiteBackgroundButtonExists());
	}
	
	@When("^I click on white background button$")
	public void i_click_on_white_background_button() {
		colorPageObj.clickOnSetWhiteBackGround();
	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() throws WebDriverException, IOException {
	    Assert.assertEquals("Background color is not changed!!!", "rgba(255, 255, 255, 1)", colorPageObj.checkIfBackGroundIsWhite());
	    takeScreenshot(driver);
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}



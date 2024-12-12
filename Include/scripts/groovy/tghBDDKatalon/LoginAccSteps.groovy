package tghBDDKatalon

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

public class LoginAccSteps {
	@Given("login page")
	public void login_page() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://parabank.parasoft.com/parabank/index.htm')
		
		WebUI.verifyTextPresent('Customer Login', false)
	}

	@When("user input username and password")
	public void user_input_username_and_password() {
		WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Administration/input_Username_username'),'andi')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_ParaBank  Administration/input_Password_password'),'A2FRRF0dkTY=')
		
	}
	
	@And("user click login button")
	public void user_click_login_button() {
		WebUI.click(findTestObject('Object Repository/Page_ParaBank  Administration/input_Password_button'))
	}
	
	@Then("user redirect to dashboard and logout")
	public void user_redirect_to_dashboard_and_logout() {
		WebUI.verifyTextPresent('Welcome', false)
		
//		WebUI.click(findTestObject('Object Repository/Page_ParaBank  Customer Created/a_Log Out'))
//		
//		WebUI.closeBrowser()
	}
}

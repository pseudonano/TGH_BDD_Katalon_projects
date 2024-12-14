package tghBDDKatalon

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

public class OpenNewAccSteps {
	@Given("user dashboard")
	public void user_dashboard() {
		WebUI.verifyTextPresent('Welcome', false)
	}

	@When("user click Open New Account")
	public void user_click_Open_New_Account() {
		WebUI.click(findTestObject('Object Repository/Page_ParaBank  Accounts Overview/a_Open New Account'))
	}

	@And("user selecting opening account option")
	public void user_selecting_opening_account_option() {
		WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_ParaBank  Open Account/select_CHECKING                  SAVINGS'),
				'1')

		WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_ParaBank  Open Account/select_13677'), '1')
	}

	@And("user click open new account button")
	public void user_click_open_new_account_button() {
		WebUI.click(findTestObject('Object Repository/Page_ParaBank  Open Account/input_What type of Account would you like to open_button'))
	}

	@Then("account opened")
	public void account_opened() {
		WebUI.verifyTextNotPresent("Congratulations, your account is now open.", false)
	}
}

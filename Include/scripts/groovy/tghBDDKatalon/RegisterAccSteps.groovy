package tghBDDKatalon

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



public class RegisterAccSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("user login page")
	public void user_login_page() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://parabank.parasoft.com/parabank/index.htm')
	}

	@When("user click register hyperlink")
	public void user_click_register_hyperlink() {
		WebUI.click(findTestObject('Object Repository/Page_ParaBank  Welcome  Online Banking/a_Register'))

		WebUI.verifyTextPresent('Signing up is easy!', false)
	}

	@And("user fill all required form")
	public void user_fill_all_required_form() {
		WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_First Name_customer.firstName'),
				'andi')

		WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_Last Name_customer.lastName'),
				'adni')

		WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_Address_customer.address.street'),
				'jl setapak sriwedari')

		WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_City_customer.address.city'),
				'surakarta')

		WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_State_customer.address.state'),
				'jawa tengah')

		WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_Zip Code_customer.address.zipCode'),
				'99998')

		WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_Phone_customer.phoneNumber'),
				'65546899897')

		WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_SSN_customer.ssn'),
				'225')

		//username must be unique
		WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_Username_customer.username'),
				'andi002')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_Password_customer.password'),
				'A2FRRF0dkTY=')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_Confirm_repeatedPassword'),
				'A2FRRF0dkTY=')
	}

	@And("user click register button")
	public void user_click_register_button() {
		WebUI.click(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_Confirm_button'))

		WebUI.verifyTextPresent('Welcome', false)
	}

	@Then("user logout")
	public void user_logout() {
		WebUI.click(findTestObject('Object Repository/Page_ParaBank  Customer Created/a_Log Out'))

		WebUI.closeBrowser()
	}
}
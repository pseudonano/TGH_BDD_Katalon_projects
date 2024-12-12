import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://parabank.parasoft.com/parabank/index.htm')

WebUI.verifyTextPresent('Customer Login', false)

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Administration/input_Username_username'), 'andi')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ParaBank  Administration/input_Password_password'), 'A2FRRF0dkTY=')

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Administration/input_Password_button'))

WebUI.verifyTextPresent('Welcome', false)

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Accounts Overview/a_Open New Account'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_ParaBank  Open Account/select_CHECKING                  SAVINGS'), 
    '1')

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_ParaBank  Open Account/select_13677'), '1')

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Open Account/input_What type of Account would you like to open_button'))

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Customer Created/a_Log Out'))

WebUI.closeBrowser()
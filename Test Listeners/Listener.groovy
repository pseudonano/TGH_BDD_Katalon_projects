import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

class Listener {
	@BeforeTestCase
	public void sampleBeforeTestCase(TestCaseContext testCaseContext) {
		CucumberKW.GLUE = ['tghBDDKatalon']
		println "I am inside Listener"
	}
}
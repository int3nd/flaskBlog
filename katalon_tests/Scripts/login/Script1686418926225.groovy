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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.176.1:5000/')

WebUI.click(findTestObject('Object Repository/Page_flaskBlog/button_'))

WebUI.click(findTestObject('Object Repository/Page_flaskBlog/a_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Search_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Search_password'), 'hnGgZsRNqJZf7W8PcjdDUw==')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

try {
    WebUI.verifyElementPresent(findTestObject('login_fail_message'), 1)
    KeywordUtil.markFailed('login unsuccessful')
} catch (Exception e) {
    KeywordUtil.markPassed('login successful')
}

WebUI.click(findTestObject('Object Repository/Page_flaskBlog/button_'))

WebUI.click(findTestObject('Object Repository/Page_flaskBlog/a_admin'))

WebUI.click(findTestObject('Object Repository/Page_admin/button_'))

WebUI.click(findTestObject('Object Repository/Page_admin/a_Logout'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.176.1:5000/')

WebUI.click(findTestObject('Object Repository/Page_flaskBlog/button_'))

WebUI.click(findTestObject('Object Repository/Page_flaskBlog/a_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Search_userName'), 'test')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Search_password'), 'YsxTccsmuDoDBwXzvpNmKQ==')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

try {
	WebUI.verifyElementPresent(findTestObject('succes_messagge'), 1)
	KeywordUtil.markFailed('login successful')
} catch (Exception e) {
	KeywordUtil.markPassed('login unsuccessful')
}

WebUI.waitForElementVisible(findTestObject('Object Repository/login_fail_message'), 0)

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.176.1:5000/')

WebUI.click(findTestObject('Object Repository/Page_flaskBlog/button_'))

WebUI.click(findTestObject('Object Repository/Page_flaskBlog/a_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Search_userName'), 'testuser')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Page_Login/input_Search_password'), 'validationMessage', 
    'Заполните это поле.', 0)

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Search_userName'), '')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Search_password'), '5NlMFRvHAa7ATndoAAy6Gg==')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

WebUI.verifyElementAttributeValue(findTestObject('Page_Login/input_Search_userName'), 'validationMessage', 'Заполните это поле.', 
    0)

WebUI.closeBrowser()


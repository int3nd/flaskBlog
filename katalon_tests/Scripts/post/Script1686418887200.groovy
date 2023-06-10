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

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://192.168.176.1:5000/')

WebUI.click(findTestObject('Object Repository/Page_flaskBlog/button_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Search_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Search_password'), 'hnGgZsRNqJZf7W8PcjdDUw==')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

try {
    WebUI.verifyElementPresent(findTestObject('Object Repository/login_fail_message'), 1)

    KeywordUtil.markFailed('login unsuccessful')
}
catch (Exception e) {
    KeywordUtil.markPassed('login successful')
} 

WebUI.click(findTestObject('Object Repository/Page_flaskBlog/button_New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Search_postTitle'), 'new title')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Search_postTags'), 'tag')

WebUI.click(findTestObject('Object Repository/Page_Create Post/p'))

WebUI.setText(findTestObject('Page_Create Post/p'), 'this is my first post')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Post'))

try {
    WebUI.verifyElementPresent(findTestObject('succes_message'), 2)

    KeywordUtil.markPassed('login successful')
}
catch (Exception e) {
    KeywordUtil.markFailed('login unsuccessful')
} 

WebUI.click(findTestObject('Object Repository/Page_flaskBlog/button_admin'))

WebUI.click(findTestObject('Object Repository/Page_admin/a_test'))

WebUI.closeBrowser()


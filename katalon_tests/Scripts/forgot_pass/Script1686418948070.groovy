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
import javax.swing.JOptionPane as JOptionPane
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.176.1:5000/')

WebUI.click(findTestObject('Object Repository/Page_flaskBlog/button_'))

WebUI.click(findTestObject('Object Repository/Page_flaskBlog/a_Login'))

WebUI.click(findTestObject('Object Repository/Page_Login/a_Forgot password'))

WebUI.setText(findTestObject('Object Repository/Page_Password Reset/input_Search_userName'), 'deluser')

WebUI.setText(findTestObject('Object Repository/Page_Password Reset/input_Search_email'), 'int3nds@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Password Reset/button_Send code'))

try {
    WebUI.verifyElementPresent(findTestObject('login_fail_message'), 1)

    KeywordUtil.markPassed('login unsuccessful')
}
catch (Exception e) {
    KeywordUtil.markFailed('login successful')
} 

WebUI.setText(findTestObject('Object Repository/Page_Password Reset/input_Search_userName'), 'admin')

WebUI.setText(findTestObject('Object Repository/Page_Password Reset/input_Search_email'), 'testmail@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Password Reset/button_Send code'))

try {
    WebUI.verifyElementPresent(findTestObject('login_fail_message'), 1)

    KeywordUtil.markPassed('login unsuccessful')
}
catch (Exception e) {
    KeywordUtil.markFailed('login successful')
} 

WebUI.click(findTestObject('Object Repository/Page_Password Reset/input_Search_email'))

WebUI.setText(findTestObject('Object Repository/Page_Password Reset/input_Search_userName'), 'admin')

WebUI.setText(findTestObject('Object Repository/Page_Password Reset/input_Search_email'), 'int3nds@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Password Reset/button_Send code'))

String code = JOptionPane.showInputDialog('Please enter the reset password CODE:')

WebUI.setText(findTestObject('Object Repository/Page_Password Reset/input_Search_code'), code)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Password Reset/input_Search_password'), 'hnGgZsRNqJaxSovEzsMAjQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Password Reset/input_Search_passwordConfirm'), 'hnGgZsRNqJaxSovEzsMAjQ==')

WebUI.click(findTestObject('Object Repository/Page_Password Reset/button_Reset password'))

WebUI.waitForElementVisible(findTestObject('Object Repository/succes_message'), 0)

WebUI.closeBrowser()


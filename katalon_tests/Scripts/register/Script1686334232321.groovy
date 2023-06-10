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
import com.kms.katalon.core.util.KeywordUtil

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.176.1:5000/')

WebUI.click(findTestObject('Object Repository/Page_flaskBlog/button_'))

WebUI.click(findTestObject('Object Repository/Page_flaskBlog/a_Sign Up'))

WebUI.setText(findTestObject('Object Repository/Page_Signup/input_Search_userName'), 'testuser22')

WebUI.setText(findTestObject('Object Repository/Page_Signup/input_Search_email'), 'testuseer62@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Signup/input_Search_password'), 'hnGgZsRNqJZf7W8PcjdDUw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Signup/input_Search_passwordConfirm'), 'hnGgZsRNqJZf7W8PcjdDUw==')

WebUI.click(findTestObject('Object Repository/Page_Signup/button_Signup'))

if (WebUI.getUrl() != 'http://192.168.176.1:5000/') {
    KeywordUtil.markFailed("URL does not match")
}
WebUI.closeBrowser()

List<HashMap<String, String>> data_table = [
    [username:'', email:'asdf.asdf@example.com', password:'Asdf@1234', confirm_password:'Asdf@1234', form_error:'Заполните это поле.', input_field:'userName'],
    [username:'asdf', email:'', password:'Asdf@1234', confirm_password:'Asdf@1234', form_error:'Заполните это поле.', input_field:'email'],
    [username:'asdf', email:'asdf', password:'', confirm_password:'Asdf@1234', form_error:'Заполните это поле.', input_field:'password'],
    [username:'asdf', email:'asdf.asdf@example.com', password:'Asdf@1234', confirm_password:'', form_error:'Заполните это поле.', input_field:'passwordConfirm']
]

WebUI.openBrowser('')

for (def row : data_table) {
    WebUI.navigateToUrl('http://192.168.176.1:5000/')

    WebUI.click(findTestObject('Object Repository/Page_flaskBlog/button_'))

    WebUI.click(findTestObject('Object Repository/Page_flaskBlog/a_Sign Up'))

    WebUI.setText(findTestObject('Object Repository/Page_Signup/input_Search_userName'), row.username)

    WebUI.setText(findTestObject('Object Repository/Page_Signup/input_Search_email'), row.email)

    WebUI.setText(findTestObject('Object Repository/Page_Signup/input_Search_password'), row.password)

    WebUI.setText(findTestObject('Object Repository/Page_Signup/input_Search_passwordConfirm'), row.confirm_password)

    WebUI.click(findTestObject('Object Repository/Page_Signup/button_Signup'))

    WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Page_Signup/input_Search_' + row.input_field), 'validationMessage', row.form_error, 0)
}
WebUI.closeBrowser()




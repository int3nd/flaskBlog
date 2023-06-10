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

WebUI.navigateToUrl('http://192.168.176.1:5000/')

WebUI.click(findTestObject('Object Repository/Page_flaskBlog/a_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Search_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Search_password'), 'hnGgZsRNqJZf7W8PcjdDUw==')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_flaskBlog/button_'))

WebUI.click(findTestObject('Object Repository/Page_flaskBlog/a_admin'))

WebUI.click(findTestObject('Object Repository/Page_admin/a_account settings'))

WebUI.click(findTestObject('Object Repository/Page_Admin Panel/button_'))

WebUI.click(findTestObject('Object Repository/Page_Admin Panel/div_admin'))

WebUI.click(findTestObject('Object Repository/Page_admin/a_dashboard'))

WebUI.click(findTestObject('Object Repository/Page_admins Dashboard/h1_flaskBlog'))

WebUI.click(findTestObject('Object Repository/Page_flaskBlog/button_'))

WebUI.click(findTestObject('Object Repository/Page_flaskBlog/a_Logout'))

WebUI.closeBrowser()


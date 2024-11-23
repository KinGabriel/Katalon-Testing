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

WebUI.openBrowser('http://localhost/SLU-Alumni-Web-Application/LogInAndRegister/view/Login.php')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Login_email'), '2235008@slu.edu.ph')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Login_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login Now'))

WebUI.click(findTestObject('Object Repository/Page_SLU Alumina/span_Log Out'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Login_email'), '2235008@slu.edu.ph')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Login_password'), 'HeCM15nHKBI=')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login Now'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Login_email'), '223508@slu.edu.ph')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Login_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Page_Login Page/button_Login Now'))


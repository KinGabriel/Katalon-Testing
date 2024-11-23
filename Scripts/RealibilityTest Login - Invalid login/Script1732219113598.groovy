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

// Open the browser and navigate to the login page
WebUI.openBrowser('http://localhost/SLU-Alumni-Web-Application/LogInAndRegister/view/Login.php')
WebUI.maximizeWindow()

// Loop to simulate multiple failed login attempts
for (int i = 0; i < 50; i++) {
    // Perform the login action with invalid credentials
    WebUI.sendKeys(findTestObject('Alumina/Login/txtEmail'), '2235008@slu.edu.ph')
    WebUI.sendKeys(findTestObject('Alumina/Login/txtPassword'), '1236') // Incorrect password
    WebUI.click(findTestObject('Alumina/Login/btnLogIn'))

    // Capture and validate the current URL after the login attempt
    String currentUrl = WebUI.getUrl()
    if (currentUrl.equals('http://localhost/SLU-Alumni-Web-Application/LogInAndRegister/view/Login.php')) {
        WebUI.comment("Login failed as expected. URL: " + currentUrl)
    } else {
        WebUI.comment("Test failed. Unexpected URL: " + currentUrl)
        WebUI.verifyEqual(currentUrl, 'http://localhost/SLU-Alumni-Web-Application/LogInAndRegister/view/Login.php', FailureHandling.STOP_ON_FAILURE)
    }
}

// Comment to indicate the end of the test loop
WebUI.comment("Test Complete")

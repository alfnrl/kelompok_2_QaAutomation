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

// Test Case 1: Username Salah
WebUI.openBrowser('' // Ganti dengan URL halaman login
    )

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.verifyElementVisible(findTestObject('login/input_Username'))

WebUI.setText(findTestObject('login/input_Username'), 'usernamesalah')

WebUI.verifyElementVisible(findTestObject('login/input_Password'))

WebUI.setText(findTestObject('login/input_Password'), 'admin123')

WebUI.click(findTestObject('login/button_Login'))

WebUI.verifyElementText(findTestObject('login/alert_userpasssalah'), 'Invalid credentials' // Ganti dengan pesan kesalahan yang muncul jika username salah
    )

WebUI.takeScreenshot()

WebUI.closeBrowser()

// Test Case 2: Password Salah
WebUI.openBrowser('' // Ganti dengan URL halaman login
    )

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.verifyElementVisible(findTestObject('login/input_Username'))

WebUI.setText(findTestObject('login/input_Username'), 'admin')

WebUI.verifyElementVisible(findTestObject('login/input_Password'))

WebUI.setText(findTestObject('login/input_Password'), 'pass salah')

WebUI.click(findTestObject('login/button_Login'))

WebUI.verifyElementText(findTestObject('login/alert_userpasssalah'), 'Invalid credentials' // Ganti dengan pesan kesalahan yang muncul jika password salah
    )

WebUI.takeScreenshot()

WebUI.closeBrowser()


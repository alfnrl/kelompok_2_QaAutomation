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

WebUI.click(findTestObject('Add/button_Time'))

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Add/button_Project'))

WebUI.verifyElementClickable(findTestObject('Add/button_Project'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Add/button_Project'))

WebUI.verifyElementClickable(findTestObject('Add/button_Customer'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Add/button_Customer'))

WebUI.verifyElementVisible(findTestObject('Add/label_Customer'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Add/button_Add'))

WebUI.verifyElementClickable(findTestObject('Add/button_Add'))

WebUI.click(findTestObject('Add/button_Add'))

WebUI.verifyElementVisible(findTestObject('Add/textbox_Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Add/textbox_Description'))

WebUI.verifyElementVisible(findTestObject('Add/button_Save'))

WebUI.verifyElementClickable(findTestObject('Add/button_Save'))

WebUI.setText(findTestObject('Add/textbox_Name'), 'Intan Wulansari')

WebUI.setText(findTestObject('Add/textbox_Description'), 'Ini data Intan')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Add/button_Save'))

WebUI.delay(4)


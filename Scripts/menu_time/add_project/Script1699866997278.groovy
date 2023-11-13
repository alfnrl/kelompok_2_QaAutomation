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

WebUI.verifyElementVisible(findTestObject('menu_time/Add_Project/button_project_info'))

WebUI.click(findTestObject('menu_time/Add_Project/button_project_info'))

WebUI.click(findTestObject('menu_time/Add_Project/button_projects'))

WebUI.verifyElementText(findTestObject('menu_time/Add_Project/label_project'), 'Projects')

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('menu_time/Add_Project/button_add'))

WebUI.click(findTestObject('menu_time/Add_Project/button_add'))

WebUI.verifyElementText(findTestObject('menu_time/Add_Project/label_add'), 'Add Project')

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('menu_time/Add_Project/textbox_name'))

WebUI.verifyElementVisible(findTestObject('menu_time/Add_Project/textbox_customer_name'))

WebUI.verifyElementVisible(findTestObject('menu_time/Add_Project/textbox_description'))

WebUI.verifyElementVisible(findTestObject('menu_time/Add_Project/textbox_project_admin'))

WebUI.verifyElementVisible(findTestObject('menu_time/Add_Project/button_save'))

WebUI.verifyElementVisible(findTestObject('menu_time/Add_Project/button_cancel'))

WebUI.setText(findTestObject('menu_time/Add_Project/textbox_name'), 'solichana')

WebUI.setText(findTestObject('menu_time/Add_Project/textbox_customer_name'), 'ACME Ltd')

WebUI.setText(findTestObject('menu_time/Add_Project/textbox_description'), 'testing punya hana')

WebUI.setText(findTestObject('menu_time/Add_Project/textbox_project_admin'), 'Paul  Collings')

WebUI.takeScreenshot()

WebUI.click(findTestObject('menu_time/Add_Project/button_save'))

WebUI.verifyElementText(findTestObject('menu_time/Add_Project/label_edit_project'), 'Edit Project')

WebUI.takeScreenshot()


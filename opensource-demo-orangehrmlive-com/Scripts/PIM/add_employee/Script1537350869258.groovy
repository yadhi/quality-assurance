import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('login_logout/login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('PIM/add_employee/Page_OrangeHRM/b_PIM'))

WebUI.click(findTestObject('PIM/add_employee/Page_OrangeHRM/a_Add Employee'))

WebUI.setText(findTestObject('PIM/add_employee/Page_OrangeHRM/input__firstName'), 'Budi')

WebUI.setText(findTestObject('PIM/add_employee/Page_OrangeHRM/input_Middle Name_middleName'), 'bin')

WebUI.setText(findTestObject('PIM/add_employee/Page_OrangeHRM/input__lastName'), 'Iwan')

WebUI.click(findTestObject('PIM/add_employee/Page_OrangeHRM/input__btnSave'))


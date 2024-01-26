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

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://130.211.243.37:96/login')

WebUI.setText(findTestObject('Object Repository/E-Learning/Page_Login  Elearning CMS/input_email'), 'admin@indocyber.com')

WebUI.setEncryptedText(findTestObject('Object Repository/E-Learning/Page_Login  Elearning CMS/input_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/E-Learning/Page_Login  Elearning CMS/button_Login'))

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/E-Learning/Page_Home  Elearning CMS/span_Feedback Bank'))

WebUI.navigateToUrl('http://130.211.243.37:96/feedback')

WebUI.click(findTestObject('Object Repository/E-Learning/Page_Feedback Bank  Elearning CMS/button_Tambah                              _c47226'))

WebUI.click(findTestObject('E-Learning/Page_Feedback Bank  Elearning CMS/expand_Choose Level'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('E-Learning/Page_Feedback Bank  Elearning CMS/Search_Level'), 'Level 1')

WebUI.sendKeys(findTestObject('E-Learning/Page_Feedback Bank  Elearning CMS/Search_Level'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('E-Learning/Page_Feedback Bank  Elearning CMS/expand_Choose Module'))

WebUI.setText(findTestObject('E-Learning/Page_Feedback Bank  Elearning CMS/Search_Module'), 'Module 1')

WebUI.sendKeys(findTestObject('E-Learning/Page_Feedback Bank  Elearning CMS/Search_Module'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/E-Learning/Page_Feedback Bank  Elearning CMS/input_title'), 'Pertanyaan 1')

WebUI.click(findTestObject('Object Repository/E-Learning/Page_Feedback Bank  Elearning CMS/input_isActive'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/E-Learning/Page_Feedback Bank  Elearning CMS/button_Save'))

WebUI.takeScreenshotAsCheckpoint('Success_add_FeedbackBank')

WebUI.closeBrowser()


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

Mobile.startApplication('C:\\Users\\0763\\Downloads\\kaf-debug.apk', true)

Mobile.tap(findTestObject('Object Repository/KAF Mobile/textEmail'), 0)

Mobile.setText(findTestObject('Object Repository/KAF Mobile/textEmail'), 'receptionist@kaf.co.id', 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/KAF Mobile/textPassword'), 0)

Mobile.setText(findTestObject('Object Repository/KAF Mobile/textPassword'), 'R3cept!#888', 0)

Mobile.delay(3)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/KAF Mobile/btnLogin'), 0)

Mobile.delay(15)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/KAF Mobile/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/KAF Mobile/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/KAF Mobile/android.view.View'), 0)

Mobile.tap(findTestObject('Object Repository/KAF Mobile/android.widget.EditText (2)'), 0)

Mobile.setText(findTestObject('Object Repository/KAF Mobile/android.widget.EditText (2)'), 'Andre Katalon1', 0)

Mobile.tap(findTestObject('Object Repository/KAF Mobile/android.widget.EditText (3)'), 0)

Mobile.setText(findTestObject('Object Repository/KAF Mobile/android.widget.EditText (3)'), 'Andre1', 0)

Mobile.tap(findTestObject('Object Repository/KAF Mobile/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/KAF Mobile/android.view.View (1)'), 0)

Mobile.tap(findTestObject('Object Repository/KAF Mobile/android.widget.Button (1)'), 0)

Mobile.takeScreenshot()

Mobile.pressBack()

Mobile.takeScreenshotAsCheckpoint('Success_add_data_cust')

Mobile.closeApplication()


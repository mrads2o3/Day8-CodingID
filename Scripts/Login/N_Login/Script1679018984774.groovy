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

Mobile.startApplication('C:\\Users\\pooyu\\Downloads\\Android-MyDemoAppRN.1.2.0.build-231.apk', true)

Mobile.tap(findTestObject('Home_Button_BreadCrumb - android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('SideBar_Button_Log In - android.widget.TextView - Log In'), 0)

Mobile.setText(findTestObject('Login_Field_Username or email - android.widget.EditText'), 'bob@example.com', 0)

Mobile.setEncryptedText(findTestObject('Login_Field_Pasword - android.widget.EditText'), 'HeCM15nHKBI=', 0)

Mobile.tap(findTestObject('Login_Button_Login - android.widget.TextView - Login'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Login_ErrorMesssage - android.widget.TextView - Provided credentials do not match any user in this service'), 
    'Provided credentials do not match any user in this service.')

Mobile.closeApplication()


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

Mobile.startApplication('C:\\Users\\MohamedAmineAjengui\\OneDrive - Aymax Technology\\Bureau\\ApiDemos-debug.apk', true)

Mobile.tap(findTestObject('Object Repository/Page_Home/android.widget.TextView - Preference'), 0)

Mobile.tap(findTestObject('Object Repository/Page_preference/android.widget.TextView - 4. Default values'), 0)

Mobile.tap(findTestObject('Object Repository/Page_preference/Page_4DefaultValues/android.widget.RelativeLayout Edit_txt_preference'), 0)

Mobile.setText(findTestObject('Object Repository/Page_preference/Page_4DefaultValues/android.widget.EditText - FavouriteAnimal'), 'Dog', 0)

Mobile.verifyElementText(findTestObject('Page_preference/Page_4DefaultValues/android.widget.EditText - FavouriteAnimal'), 'Dog')

Mobile.tap(findTestObject('Object Repository/Page_preference/Page_4DefaultValues/android.widget.Button - OK'), 0)

Mobile.closeApplication()


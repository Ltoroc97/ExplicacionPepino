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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('AbrirNavegador/AbrirNavegador'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/RealizarBusqueda/CampoBusqueda'), 'Pepino sin busqueda')

WebUI.navigateToUrl('https://www.google.com/search?source=hp&ei=18ZfXsS9L8Sb_Qaxo4nADg&q=Pepino&oq=PepinoSinBusqueda&gs_l=psy-ab.3..0i131j0l9.11823.13087..29913...0.0..0.196.959.0j7......0....1..gws-wiz.....6..0i362i308i154i357..26%3A154.57142857142858.Wpayne-jZ0A&ved=0ahUKEwiEhej-joHoAhXETd8KHbFRAugQ4dUDCAY&uact=5')

WebUI.comment('Busqueda con Seleccion de campo')

WebUI.navigateToUrl('www.google.com')

WebUI.setText(findTestObject('Object Repository/RealizarBusqueda/CampoBusqueda'), Busqueda)

WebUI.click(findTestObject('Object Repository/RealizarBusqueda/SeleccionaRecuadroExterno'))

WebUI.click(findTestObject('Object Repository/RealizarBusqueda/Boton_BuscarGoogle'))

WebUI.closeBrowser()


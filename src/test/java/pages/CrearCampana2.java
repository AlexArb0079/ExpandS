package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import net.thucydides.core.pages.PageObject;

public class CrearCampana2 extends PageObject {

	WebDriverWait wait;
	
	private By agregarContactoManual;
	private By agregarContacto;
	private By nombreDeContacto;
	private By numeroDeTelefono;
	private By extra1;
	private By extra2;
	private By aceptarContacto;
	private By finalizar;
	
	public CrearCampana2(WebDriver driver) {
		super(driver);
		wait = new WebDriverWait(driver, 10);
		
		agregarContactoManual = By.id("main_moduleContent_current_view_active_module_textinpAgregarContactos_button");
		agregarContacto = By.id("main_moduleContent_current_view_active_module_contacts_container_contactList_toolbar_add_button");
		nombreDeContacto = By.id("main_moduleContent_current_view_active_module_contacts_container_contactList_contactPopup_inpContactName");
		numeroDeTelefono = By.id("main_moduleContent_current_view_active_module_contacts_container_contactList_contactPopup_inpPhone");
		extra1 = By.id("main_moduleContent_current_view_active_module_contacts_container_contactList_contactPopup_dataGrid_repeater_control_value");
		extra2 = By.id("main_moduleContent_current_view_active_module_contacts_container_contactList_contactPopup_dataGrid_repeater_control2_value");
		aceptarContacto = By.id("main_moduleContent_current_view_active_module_contacts_container_contactList_contactPopup_acceptButton_button");
		finalizar = By.id("main_moduleContent_current_view_active_module_cancelCampaign2_button");
		
		
	}
	
	public void agregarContactosManuales() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(agregarContactoManual));
		getDriver().findElement(agregarContactoManual).click();
	}
	
	public void agregarContacto(String name, String numero, String adicional1, String adicional2) {
		wait.until(ExpectedConditions.elementToBeClickable(agregarContacto));
		getDriver().findElement(agregarContacto).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(nombreDeContacto));
		getDriver().findElement(nombreDeContacto).sendKeys(name);
		getDriver().findElement(numeroDeTelefono).sendKeys(numero);
		getDriver().findElement(extra1).sendKeys(adicional1);
		getDriver().findElement(extra2).sendKeys(adicional2);
		getDriver().findElement(aceptarContacto).click();
		
	}
	
	public void finalizar() {
		wait.until(ExpectedConditions.elementToBeClickable(finalizar));
		getDriver().findElement(finalizar).click();
	}

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.thucydides.core.pages.PageObject;

public class Discador extends PageObject {
	
	private By crearCampana;
	
	WebDriverWait wait;
	
	public Discador(WebDriver driver) {
		super(driver);
		wait = new WebDriverWait(driver, 10);
		crearCampana = By.id("main_moduleContent_current_view_active_module_createCampaign_button");
		
	}
	
	public void crearCampana() {
		getDriver().findElement(crearCampana).click();
	}
	
	

}

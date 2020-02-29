package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.thucydides.core.pages.PageObject;

public class Dashboard extends PageObject{

	private By discador;
	private By menu;
	
	WebDriverWait wait;
	
	public Dashboard(WebDriver driver) {
		super(driver);
		wait = new WebDriverWait(driver, 10);
		discador = By.id("Web3.LeftBar_categoryDialer_control");
		menu = By.id("main_moduleContent_current_view_active_module_ActivityMonitor_title");
		
	}
	
	public void goToDiscador() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(menu));
		getDriver().findElement(discador).click();
	}
	
}

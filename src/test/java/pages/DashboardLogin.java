package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.thucydides.core.pages.PageObject;

public class DashboardLogin extends PageObject{
	private By userName;
	private By passWord;
	private By LoginButton;
	
	WebDriverWait wait;
	
	public DashboardLogin(WebDriver driver) {
		super(driver);
		wait = new WebDriverWait(driver, 10);
		userName = By.id("login_loginForm_user");
		passWord = By.id("login_loginForm_password");
		LoginButton = By.id("login_loginForm_enterButton_button");
	}
	
	public void navigateTo() {
		getDriver().manage().window().maximize();
		getDriver().get("http://canalesdigitales.expand/frontEnd/#login");
	}
	
	public void login(String name, String pass) {
		getDriver().findElement(userName).sendKeys(name);
		getDriver().findElement(passWord).sendKeys(pass);
		getDriver().findElement(LoginButton).click();
	}
}

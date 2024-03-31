package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
@FindBy(name="username")
private WebElement unTbx;
@FindBy(name="pwd")
private WebElement pwdTbx;
@FindBy(partialLinkText="Login ")
private WebElement loginBtn;

public void setLogin(String un,String pwd) {
	unTbx.sendKeys(un);
	pwdTbx.sendKeys(pwd);
	loginBtn.click();
}
}



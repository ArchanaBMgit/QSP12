package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserListPage {
	public UserListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
@FindBy(className="buttonText")
private WebElement adduserBtn;
@FindBy(name="firstName")
private WebElement firstNameTbx;
@FindBy(name="lastName")
private WebElement lastNameTbx;
@FindBy(name="email")
private WebElement emailTbx;
@FindBy(name="username")
private WebElement usenameTbx;
@FindBy(name="password")
private WebElement passwordTbx;
@FindBy(name="passwordCopy")
private WebElement retypepassTBx;
@FindBy(id="userDataLightBox_commitBtn")
private WebElement createUserBtn;
public WebElement getAdduserBtn() {
	return adduserBtn;
}
public WebElement getFirstNameTbx() {
	return firstNameTbx;
}
public WebElement getLastNameTbx() {
	return lastNameTbx;
}
public WebElement getEmailTbx() {
	return emailTbx;
}
public WebElement getUsenameTbx() {
	return usenameTbx;
}
public WebElement getPasswordTbx() {
	return passwordTbx;
}
public WebElement getRetypepassTBx() {
	return retypepassTBx;
}
public WebElement getCreateUserBtn() {
	return createUserBtn;

}
}
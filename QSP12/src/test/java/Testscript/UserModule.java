package Testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.WebDriverUtils;
import pom.HomePage;
import pom.UserListPage;

public class UserModule extends BaseClass {
	@Test
	public void createUser() throws EncryptedDocumentException, IOException, InterruptedException {
	WebDriverUtils w=new WebDriverUtils();
	int row =w.getLastRow("createUser");
	for(int i=1;i<=row;i++)
	{
		String firstName=f.readDataFromExcel("createUser", i, 1);
		String lastName=f.readDataFromExcel("createUser", i, 2);
		String email=f.readDataFromExcel("createUser", i, 3);
		String userName=f.readDataFromExcel("createUser", i, 4);
		String password=f.readDataFromExcel("createUser", i, 5);
		String retypePassword=f.readDataFromExcel("createUser", i, 6);
		String expectedUser=f.readDataFromExcel("createUser", i, 7);
			HomePage h=new HomePage(driver);
			int count=500;
			h.setUserListTab();
			UserListPage u=new UserListPage(driver);
			u.getAdduserBtn().click();
		
		u.getFirstNameTbx().sendKeys(firstName);Thread.sleep(count);
		u.getLastNameTbx().sendKeys(lastName);Thread.sleep(count);
		u.getEmailTbx().sendKeys(email);Thread.sleep(count);
		u.getUsenameTbx().sendKeys(userName);Thread.sleep(count);
		u.getPasswordTbx().sendKeys(password);Thread.sleep(count);
		u.getRetypepassTBx().sendKeys(retypePassword);Thread.sleep(count);
		
}
	
}
}
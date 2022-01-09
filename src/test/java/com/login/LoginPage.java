package com.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.base.LibGlobal;

public class LoginPage extends LibGlobal {

	@FindBy(id="username")
	private WebElement txtUserName;
	
	@FindBy(id="password")
	private WebElement txtpassword;
	
	@FindBy(id="Login")
	private WebElement btnLogin;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	private void login(String UserName,String Password) {
		type(getTxtUserName(), UserName);
		type(getTxtpassword(), Password);
         click(getBtnLogin());
         
         System.out.println("dev");
	}
	
	
	
	
}

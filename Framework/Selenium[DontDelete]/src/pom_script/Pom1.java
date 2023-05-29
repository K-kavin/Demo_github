package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {
	//declaration
	@FindBy(id="email")
	private WebElement untBox;
	@FindBy(name="pass")
	private WebElement pwdtBox;
	@FindBy(name="login")
	private WebElement loginBtn;
	//initialization
	public Pom1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//utilization
	public void userName(String un)
	{
		untBox.sendKeys(un);
	}
	public void passWord(String pwd)
	{
		pwdtBox.sendKeys(pwd);
	}
	public void clickLogin()
	{
		loginBtn.click();
	}

}

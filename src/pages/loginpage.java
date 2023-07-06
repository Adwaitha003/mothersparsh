package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	WebDriver driver;
By mailid=By.name("customer[email]");
By password=By.name("customer[password]");
By loginclick=By.xpath("//button[contains(text(),'Sign in')]");
public loginpage(WebDriver driver) {
	this.driver=driver;
}
public void log(String email,String pwd) {
	driver.findElement(mailid).sendKeys(email);
	driver.findElement(password).sendKeys(pwd);
}
public void signin() {
	driver.findElement(loginclick).click();
}
}

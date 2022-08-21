package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Account_Page_Elements {
    public My_Account_Page_Elements(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//span[text()=' Welcome, Evisa Nano ! ']")
    public WebElement welcomeMessage;

    @FindBy(xpath="//div[text()='Invalid username or password']")
    public WebElement errorMessage;
}

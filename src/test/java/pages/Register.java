package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Register {
    public Register(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[@class=\"nav-link\" and @href=\"/auth\"]")
    public WebElement login;

    @FindBy(xpath = "(//li[@class='nav-item'])[2]")
    public WebElement regis;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firsName;

    @FindBy(xpath = "//input[@name='password' and @class='form-control is-invalid']")
    public WebElement password;

    @FindBy(xpath = "//*[text()=' Register']")
    public WebElement registerButton;

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.lang.reflect.Field;
import java.util.List;

public class LoginOptionPage {
    private WebDriver driver;

    @FindBy(css = "div.center:nth-child(1) > button:nth-child(1)")
    WebElement customerLoginButton;

//    @FindBy(name = "myform")
//    WebElement customerLoginForm;

    public LoginOptionPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void pressCustomerLoginButton() {
        customerLoginButton.click();
    }

    public void showCheckCustomerLoginPageResult() {
        List<WebElement> dynamicElement = driver.findElements(By.name("myForm"));
        if(dynamicElement.size() != 0){
            System.out.println("Element present");
        }
        else{
            System.out.println("Element not present");
        }
    }
}

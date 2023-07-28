package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {

    //this is object repository
    @FindBy(id = "txtUsername")
    public WebElement userNameBox;

    @FindBy(id="txtPassword")
    public WebElement passwordBox;

    @FindBy(id = "btnLogin")
    public WebElement loginBtn;

    public LoginPage() {    //page factory interfaceini kullanmadan yukarıdaki locatorları diğer yerlerde kullanamayız!!!!!!!
        PageFactory.initElements(driver,this);
    }
}

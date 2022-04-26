package starter.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

public class qasir_pages extends PageObject {
    @FindBy(id = "btn-country-flag")
    WebElement buttonFlag;
    public void btnFlag(){
        buttonFlag.click();
    }
    @FindBy(xpath = "//img[@alt='ID']")
    WebElement flagIndo;
    public void indoFlag(){
        flagIndo.click();
    }
    @FindBy(id = "sign-in-phonenumber")
    WebElement fieldPhone;
    public void phoneField(){
        fieldPhone.sendKeys("89635901289");
    }
    @FindBy(id = "password")
    WebElement fieldPassword;
    public void passField(){
        fieldPassword.sendKeys("010597");
    }
    @FindBy(id = "submit-btn-signin")
    WebElement buttonLogin;
    public void btnLogin(){
        buttonLogin.click();
    }
    @FindBy(id = "//div[@id='form-select-outlet']//div[2]")
    WebElement fieldOutlet;
    public void outletField(){
        fieldPassword.click();
    }
    @FindBy(xpath = "//div[@class='user-image new-user-image']//img[@alt='Rahmanto ujann']")
    WebElement imageProfile;
    public void imgProfile(){
        imageProfile.click();
    }
    @FindBy(xpath = "//a[normalize-space()='User Profile']")
    WebElement buttonUserProfile;
    public void btnUserProfile(){
        buttonUserProfile.click();
    }
    @FindBy(xpath = "//input[@name='last_name']")
    WebElement fieldLastname;
    public void lastname(){
        fieldLastname.sendKeys("Manto");
    }
    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement buttonTextSave;
    public void btnTextSave(){
        buttonTextSave.click();
    }
    @FindBy(xpath = "//div[@role='alert']")
    WebElementFacade alert;
    public void alertSave(){
        alert.shouldBePresent();
    }
}
package manager;

import dto.UserDTO;
import dto.UserDTOWith;
import dto.UserLombok;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperUser extends HelperBase {
    public HelperUser(WebDriver wd) {
        super(wd);
    }
    By btnLoginNavigatorMenu = By.xpath("//a[contains(@href, '/login')]");
    By inputEmailLoginForm = By.xpath("//input[@id='email']");
    By inputPasswordLoginForm = By.xpath("//input[@id='password']");
    By btnYallaLoginForm = By.xpath("//button[@type='submit']");
    By textSuccessLoginPopUp = By.xpath("//h2[@class='message']");




    public void login(UserDTO user) {
        clickBase(btnLoginNavigatorMenu);
        typeTextBase(inputEmailLoginForm, user.getEmail());
        typeTextBase(inputPasswordLoginForm, user.getPassword());
        clickBase(btnYallaLoginForm);
    }
    public void loginWith(UserDTOWith user) {

            clickBase(btnLoginNavigatorMenu);
            typeTextBase(inputEmailLoginForm, user.getEmail());
            typeTextBase(inputPasswordLoginForm, user.getPassword());
            clickBase(btnYallaLoginForm);
        }
        public void loginLombok (UserLombok user){
            clickBase(btnLoginNavigatorMenu);
            typeTextBase(inputEmailLoginForm, user.getEmail());
            typeTextBase(inputPasswordLoginForm, user.getPassword());
            clickBase(btnYallaLoginForm);


    }




    public boolean validatePopUpMessageSuccessAfterLogin() {
        return isTextEqual(textSuccessLoginPopUp, "Logged in success");
    }
}


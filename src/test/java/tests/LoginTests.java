package tests;

import dto.UserDTO;
import dto.UserDTOWith;
import dto.UserLombok;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
    @Test
    public void positiveLoginUserDTO() {
        UserDTO userDTO = new UserDTO("testqa20@gmail.com", "123456Aa$");
        BaseTest.app.getUserHelper().login(userDTO);
        Assert.assertTrue(BaseTest.app.getUserHelper().validatePopUpMessageSuccessAfterLogin());

    }
    @Test
    public void loginPositiveLombok() {
        UserLombok user=UserLombok.builder()
                .email("nefr42@gmail.com")
                .password("Rita12345$")
                .build();

       app.getUserHelper().loginLombok(user);
        Assert.assertTrue(BaseTest.app.getUserHelper().validatePopUpMessageSuccessAfterLogin());
    }


    @Test
    public void positiveLoginUserDTOWith() {
        UserDTOWith userDTOWith = new UserDTOWith()
                .withEmail("testqa20@gmail.com")
                .withPassword("123456Aa$");
        app.getUserHelper().login(userDTOWith);
        Assert.assertTrue(BaseTest.app.getUserHelper().validatePopUpMessageSuccessAfterLogin());

    }


}

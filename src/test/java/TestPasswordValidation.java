import org.example.Main;
import org.example.exception.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestPasswordValidation {
 @Test
    void testPwdValidNull()
 {
     String password="";
     Exception ex =assertThrows(
         PasswordValueNullException.class,() -> Main.passwordValidate(password));
     assertEquals("Password cannot be empty or null",ex.getMessage());

 }
    @Test
    void testPwdValidlength()
    {
        String password="Ab12";
        Exception ex =assertThrows(
                PasswordLenghthValidException.class,() -> Main.passwordValidate(password));
        assertEquals("Password has less than 8 charectors",ex.getMessage());

    }
    @Test
    void testPwdValidUpperCase()
    {
        String password="abcd12345";
        Exception ex =assertThrows(
                PasswordUpperLetterCaseValidException.class,() -> Main.passwordValidate(password));
        assertEquals("Password should have atleast one upper letter",ex.getMessage());

    }
    @Test
    void testPwdValidLowerCase()
    {
        String password="ABCD12345";
        Exception ex =assertThrows(
                PasswordLowerLetterCaseValidException.class,() -> Main.passwordValidate(password));
        assertEquals("Password should have atleast one lower letter",ex.getMessage());

    }
    @Test
    void testPwdValidDigit()
    {
        String password="ABCDEabcd";
        Exception ex =assertThrows(
                PasswordDigitValidException.class,() -> Main.passwordValidate(password));
        assertEquals("Password should have atleast one digit",ex.getMessage());

    }
    @Test
    void testPwdValidSucess()
    {
        String password="abcABC@1234";
        assertDoesNotThrow(() -> Main.passwordValidate(password));


    }

}

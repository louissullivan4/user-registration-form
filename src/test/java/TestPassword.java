import com.registrationform.PasswordValidation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestPassword {
//    @Test
//    public void TestPasswordLength(){
//        PasswordValidation newPd = new PasswordValidation();
//        Assertions.assertTrue(newPd.validPdLen("abc1234"));
//    }
    @Test
    public void TestPasswordContainsVals(){
        PasswordValidation newPd = new PasswordValidation();
        Assertions.assertTrue(newPd.validPassword("*@abc2345"));
    }
}

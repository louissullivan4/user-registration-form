import com.registrationform.PasswordValidation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 * The type Test password.
 */
public class TestPassword {

    /**
     * Test password contains special cases, letter and digit.
     */
    @Test
    public void TestPasswordContainsVals(){
        PasswordValidation newPd = new PasswordValidation();
        Assertions.assertTrue(newPd.validPassword("*@abc2345"));
    }
}

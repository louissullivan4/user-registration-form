import com.registrationform.EmailValidation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * The type Test email.
 */
public class TestEmail {
    /**
     * Test email is as @
     */
    @Test
    public void TestEmailHasAt(){
        EmailValidation newEmail = new EmailValidation();
        Assertions.assertTrue(newEmail.validEmail("louis123@gmail.com"));
    }
    /**
     * Test email is as @ and .com
     */
    @Test
    public void TestEmailHasAtCom(){
        EmailValidation newEmail = new EmailValidation();
        Assertions.assertTrue(newEmail.validEmail("louis123@gmail.com"));
    }
    /**
     * Test email is more than one email
     */
    @Test
    public void TestEmailHasTwoAtCom(){
        EmailValidation newEmail = new EmailValidation();
        Assertions.assertTrue(newEmail.validEmail("louis123@gmail.com"));
    }
    /**
     * Test email is well-formed with regex
     */
    @Test
    public void TestEmailWellFormed(){
        EmailValidation newEmail = new EmailValidation();
        Assertions.assertTrue(newEmail.validEmail("louis123@gmail.com"));
    }
}

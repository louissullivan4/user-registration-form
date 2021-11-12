import com.registrationform.EmailValidation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * The type Test email.
 */
public class TestEmail {
    /**
     * Test email is well-formed.
     */
    @Test
    public void TestEmailWellFormed(){
        EmailValidation newEmail = new EmailValidation();
        Assertions.assertTrue(newEmail.validEmail("louis123@gmail.com"));
    }
}

import com.registrationform.registrationform.EmailValidation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEmail {
    @Test
    public void TestEmailWellFormed(){
        EmailValidation newEmail = new EmailValidation();
        Assertions.assertTrue(newEmail.validEmail("louis123@gmail.com"));
    }
}

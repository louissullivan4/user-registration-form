import com.registrationform.registrationform.EmailValidation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEmail {
    @Test
    public void TestEmailWellFormed(){
        EmailValidation newEmail = new EmailValidation();
        //check to make sure string is not empty and is only one value
        Assertions.assertTrue(newEmail.validEmail("louis123@gmail.com kyle1@gmail.com"));
    }
}

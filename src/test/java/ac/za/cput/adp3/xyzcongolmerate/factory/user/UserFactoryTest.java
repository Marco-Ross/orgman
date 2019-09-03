package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {

    @Test
    public void buildUser() {
        //Generate mock object.
        User user = UserFactory.buildUser("marcoross37@gmail.com", "Marco","Ross");

        Assert.assertNotNull(user); //Check if object notNull.

        //Check if UserEmail, FirstName & LastName is notNull
        Assert.assertNotNull(user.getUserEmail());
        Assert.assertNotNull(user.getFirstName());
        Assert.assertNotNull(user.getLastName());
    }
}
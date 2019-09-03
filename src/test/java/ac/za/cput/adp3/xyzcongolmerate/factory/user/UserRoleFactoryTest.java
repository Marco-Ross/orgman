package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import ac.za.cput.adp3.xyzcongolmerate.util.Helper;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRoleFactoryTest {

    @Test
    public void buildUserRole() {
        //Generate mock object & ID.
        String userRoleSuffix = Helper.getSuffixFromClassName(UserRoleFactory.class);
        String roleID = Helper.generateRandomGivenSuffix(userRoleSuffix);

        UserRole userRole = UserRoleFactory.buildUserRole("CodeBlue", "marcoross37@gmail.com", roleID);

        Assert.assertNotNull(userRole); //Check if object notNull.

        //Check if UserEmail, FirstName & LastName is notNull
        Assert.assertNotNull(userRole.getOrgCode());
        Assert.assertNotNull(userRole.getUserEmail());
        Assert.assertNotNull(userRole.getRoleId());
    }
}
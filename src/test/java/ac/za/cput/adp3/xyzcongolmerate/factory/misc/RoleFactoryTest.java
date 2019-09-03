package ac.za.cput.adp3.xyzcongolmerate.factory.misc;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import ac.za.cput.adp3.xyzcongolmerate.util.Helper;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoleFactoryTest {

    @Test
    public void buildRole() {
        //Generate mock object & suffix.
        String suffix = Helper.getSuffixFromClassName(RoleFactory.class);
        Role role = RoleFactory.buildRole("Manager");

        Assert.assertNotNull(role.getRoleId()); //Check if notNull.
        Assert.assertNotNull(role); //Check if notNull.

        //Check that the "suffix" of ID is correct by comparing it to mock one generated
        for(int i = 0; i<suffix.length(); i++){
            Assert.assertEquals(suffix.charAt(i), role.getRoleId().charAt(i));
        }

        Assert.assertNotNull(role.getRoleName()); //Check if Description is notNull
    }
}
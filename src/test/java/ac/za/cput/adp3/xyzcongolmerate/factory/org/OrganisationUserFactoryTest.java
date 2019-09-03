package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import ac.za.cput.adp3.xyzcongolmerate.util.Helper;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {

    @Test
    public void buildOrganisationUser() {
        //Generate mock object.
        OrganisationUser organisationUser = OrganisationUserFactory.buildOrganisationUser("CodeRed", "marcoross37@gmail.com");

        Assert.assertNotNull(organisationUser); //Check if object notNull.

        //Check if OrgCode & UserEmail is notNull
        Assert.assertNotNull(organisationUser.getOrgCode());
        Assert.assertNotNull(organisationUser.getUserEmail());
    }
}
package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.util.Helper;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationFactoryTest {

    @Test
    public void buildOrganisation() {
        //Generate mock object & suffix.
        String suffix = Helper.getSuffixFromClassName(OrganisationFactory.class);
        Organisation organisation = OrganisationFactory.buildOrganisation("Foodies");

        Assert.assertNotNull(organisation.getOrgCode()); //Check if notNull.
        Assert.assertNotNull(organisation); //Check if notNull.

        //Check that the "suffix" of Code is correct by comparing it to mock one generated
        for(int i = 0; i<suffix.length(); i++){
            Assert.assertEquals(suffix.charAt(i), organisation.getOrgCode().charAt(i));
        }

        Assert.assertNotNull(organisation.getOrgName()); //Check if Description is notNull
    }
}
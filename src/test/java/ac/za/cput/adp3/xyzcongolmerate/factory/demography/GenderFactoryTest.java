package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import ac.za.cput.adp3.xyzcongolmerate.util.Helper;
import org.junit.Assert;
import org.junit.Test;

public class GenderFactoryTest {

    @Test
    public void buildGender() {
        //Generate mock object & suffix.
        String suffix = Helper.getSuffixFromClassName(GenderFactory.class);
        Gender gender = GenderFactory.buildGender("Male");

        Assert.assertNotNull(gender.getGenderId()); //Check if notNull.
        Assert.assertNotNull(gender); //Check if notNull.

        //Check that the "suffix" of ID is correct by comparing it to mock one generated
        for(int i = 0; i<suffix.length(); i++){
            Assert.assertEquals(suffix.charAt(i), gender.getGenderId().charAt(i));
        }

        Assert.assertNotNull(gender.getGenderDescription()); //Check if Description is notNull
    }
}
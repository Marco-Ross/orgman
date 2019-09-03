package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.GenderFactory;
import ac.za.cput.adp3.xyzcongolmerate.util.Helper;
import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {

    @Test
    public void buildUserDemography() {
        //Generate mock ID's for the object.
        String genderSuffix = Helper.getSuffixFromClassName(GenderFactory.class);
        String raceSuffix = Helper.getSuffixFromClassName(GenderFactory.class);

        String genderID = Helper.generateRandomGivenSuffix(genderSuffix);
        String raceID = Helper.generateRandomGivenSuffix(raceSuffix);

        //Creating mock date.
        Calendar date = Calendar.getInstance();
        Date today = date.getTime();

        UserDemography userDemography = UserDemographyFactory.buildUserDemography("CodeRed", "marcoross37@gmail.com", genderID, raceID, today);

        Assert.assertNotNull(userDemography); //Check if object notNull.

        //Check if UserEmail, UserTitle, GenderID, RaceID & DOB is notNull
        Assert.assertNotNull(userDemography.getUserEmail());
        Assert.assertNotNull(userDemography.getUserTitle());
        Assert.assertNotNull(userDemography.getGenderId());
        Assert.assertNotNull(userDemography.getRaceId());
        Assert.assertNotNull(userDemography.getDateOfBirth());
    }
}
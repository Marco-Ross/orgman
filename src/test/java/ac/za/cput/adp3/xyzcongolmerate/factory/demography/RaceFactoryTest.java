package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import ac.za.cput.adp3.xyzcongolmerate.util.Helper;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    @Test
    public void buildRace() {
        //Generate mock object & suffix.
        String suffix = Helper.getSuffixFromClassName(RaceFactory.class);
        Race race = RaceFactory.buildRace("Orange");

        Assert.assertNotNull(race.getRaceId()); //Check if notNull.
        Assert.assertNotNull(race); //Check if notNull.

        //Check that the "suffix" of ID is correct by comparing it to mock one generated
        for(int i = 0; i<suffix.length(); i++){
            Assert.assertEquals(suffix.charAt(i), race.getRaceId().charAt(i));
        }

        Assert.assertNotNull(race.getRaceDescription()); //Check if Description is notNull
    }
}
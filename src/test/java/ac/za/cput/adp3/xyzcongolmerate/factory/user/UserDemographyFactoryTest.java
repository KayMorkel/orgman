package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {

    @Test
    public void buildUserDemography()
    {
        String userEmail = "MerleHamman@yahoo.com";
        String userTitle = "Miss";
        String genderId = "GF";
        String raceId = "RF";
        Date dateOfBirth = new Date();

        UserDemography userDemog = UserDemographyFactory.buildUserDemography(userEmail, userTitle, genderId, raceId, dateOfBirth);

        Assert.assertNotNull(userDemog);
        Assert.assertEquals(userEmail, userDemog.getUserEmail());
        Assert.assertEquals(raceId, userDemog.getRaceId());

        System.out.println(userDemog.getUserEmail() + "\n" + userDemog.getUserTitle()
                + "\n" + userDemog.getGenderId()  + "\n" + userDemog.getRaceId()  + "\n" + userDemog.getDateOfBirth());
        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 2. Remove line [throw new UnsupportedOperationException("Not yet supported.");]
         * 3. Test the UserDemographyFactory class
         * 4. Assert that the an object is created.
         */
    }
}
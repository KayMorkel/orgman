package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    @Test
    public void buildRace()
    {
        String race = "Coloured";

        Race race1 = RaceFactory.buildRace(race);

        Assert.assertNotNull(race1.getRaceId());
        Assert.assertEquals(race, race1.getRaceDescription());

        System.out.println(race1.getRaceId() + "\n" + race1.getRaceDescription());
        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 2. Remove line [throw new UnsupportedOperationException("Not yet supported.");]
         * 3. Test the RaceFactory class
         * 4. Assert that the id is generated.
         */
    }
}
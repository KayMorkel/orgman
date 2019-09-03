package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationFactoryTest {

    @Test
    public void buildOrganisation()
    {
        String organisation = "XYZConglomerate";

        Organisation organisation1 = OrganisationFactory.buildOrganisation(organisation);

        Assert.assertNotNull(organisation1.getOrgCode());
        Assert.assertEquals(organisation, organisation1.getOrgName());

        System.out.println(organisation1.getOrgCode() + "\n" + organisation1.getOrgName());
        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 2. Remove line [throw new UnsupportedOperationException("Not yet supported.");]
         * 3. Test the OrganisationFactory class
         * 4. Assert that the id is generated.
         */
    }
}
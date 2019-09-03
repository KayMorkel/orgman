package ac.za.cput.adp3.xyzcongolmerate.factory.misc;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoleFactoryTest
{

    @Test
    public void buildRole()
    {
        String roleName = "CEO";

        Role role = RoleFactory.buildRole(roleName);

        Assert.assertNotNull(role.getRoleId());
        Assert.assertEquals(roleName, role.getRoleName());

        System.out.println(role.getRoleId() + "\n" + role.getRoleName());
        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 2. Remove line [throw new UnsupportedOperationException("Not yet supported.");]
         * 3. Test the RoleFactory class
         * 4. Assert that the id is generated.
         */
    }
}
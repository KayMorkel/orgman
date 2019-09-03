package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRoleFactoryTest
{
    @Test
    public void buildUserRole()
    {
        String ordCode = "OF";
        String userEmail = "kayKorpor@yahoo.com";
        String roleId = "RF";

        UserRole userRole = UserRoleFactory.buildUserRole(ordCode, userEmail, roleId);

        Assert.assertNotNull(userRole);
        Assert.assertEquals(ordCode, userRole.getOrgCode());

        System.out.println(userRole.getOrgCode() + " \n" +  userRole.getUserEmail()  + " \n" + userRole.getRoleId());

        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 2. Remove line [throw new UnsupportedOperationException("Not yet supported.");]
         * 3. Test the UserRoleFactory class
         * 4. Assert that the an object is created.
         */
    }
}
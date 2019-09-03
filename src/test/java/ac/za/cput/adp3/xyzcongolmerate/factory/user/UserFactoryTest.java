package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest
{

    @Test
    public void buildUser()
    {
        String userEmail = "KayMork@gmail.com";
        String fName = "Kaylin";
        String lName = "Morkel";

        User user = UserFactory.buildUser(userEmail, fName, lName);

        Assert.assertNotNull(user);
        Assert.assertEquals(userEmail, user.getUserEmail());

        System.out.println(user.getUserEmail() + "\n" + user.getFirstName()  + "\n" + user.getLastName());
        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 1. Remove line [throw new UnsupportedOperationException("Not yet supported.");]
         * 2. Test the UserFactory class
         * 3. Assert that the an object is created.
         */
    }
}
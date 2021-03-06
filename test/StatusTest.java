import static org.junit.Assert.*;

import org.junit.Test;

import models.Status;
import models.User;

/**
 * Tests for the {@link Status} class.
 * @author Wei Li
 *
 */
public class StatusTest{

    /**
     * Getter test for User
     */
	@Test
	public void testGetUser() {
		Status status=new Status();
		User user=new User();
		status.setUser(user);
		assertEquals(user,status.getUser());
	}

    /**
     * Setter test for User
     */
	@Test
	public void testSetUser() {
		Status status=new Status();
		User user=new User();
		status.setUser(user);
		assertEquals(user,status.getUser());
	}

    /**
     * Getter test for FullText
     */
	@Test
	public void testGetFullText() {
		Status status=new Status();
		status.setFullText("Have a nice day!");
		assertEquals("Have a nice day!",status.getFullText());
	}

    /**
     * Setter test for FullText
     */
	@Test
	public void testSetFullText() {
		Status status=new Status();
		status.setFullText("Have a nice day!");
		assertEquals("Have a nice day!",status.getFullText());	}

}

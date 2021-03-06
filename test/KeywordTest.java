import static org.junit.Assert.*;

import org.junit.Test;

import models.Keyword;
/**
 * Test for the{@link Keyword} class.
 * @author Wei Li
 *
 */
public class KeywordTest {
    /**
     * Getter test for Keyword
     */
	@Test
	public void testGetKeyword() {
		Keyword keyword=new Keyword();
		keyword.setKeyword("Concordia");
		assertEquals("Concordia",keyword.getKeyword());
	
	}

    /**
     * Setter test for Keyword
     */
	@Test
	public void testSetKeyword() {
		Keyword keyword=new Keyword();
		keyword.setKeyword("Concordia");
		assertEquals("Concordia",keyword.getKeyword());
	}
}

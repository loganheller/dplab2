package lifeform;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests the functionality provided by the LifeForm class
 * 
 */
public class TestLifeForm
{
	
	/**
	 * When a LifeForm is created, it should know its name and how
	 * many life points it has.
	 */
		@Test
		public void testInitialization()
		{
			LifeForm entity;
			entity = new LifeForm("Bob", 40);
			assertEquals("Bob", entity.getName());
			assertEquals(40, entity.getCurrentLifePoints());
		}
		
		@Test
		public void testHpAboveZero()
		{
			LifeForm entity;
			entity = new LifeForm("Bob", -3);
			assertFalse(//enter int statement for lifeAbove zero. Left off on page 24, step 3)
		}
		
}

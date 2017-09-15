package environment;
import static org.junit.Assert.*;

import org.junit.Test;

//import lifeform.LifeForm; dont need due to due to child class MockLifeForm
import lifeform.MockLifeForm;

public class TestEnvironment {

	/**
	 * Tests if the environment board is created
	 * and works properly
	 */
	@Test
	public void testInit() 
	{
		Environment environment = new Environment(2,3);
		assertNull(environment.getLifeForm(0,0));
		MockLifeForm lifeform = new MockLifeForm("Joe", 50);
		environment.addLifeForm(1,2,lifeform);
		assertEquals(lifeform, environment.getLifeForm(1,2));
	}
	

}

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/*
import lifeform.LifeForm;
import environment.Cell;
import environment.Environment;
*/

import lifeform.TestLifeForm;
import environment.TestCell;
import environment.TestEnvironment;

// this is a test for git
/**
 * 
 * Runs all of the tests in this project
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses(
{
	TestLifeForm.class,
	TestCell.class,
	TestEnvironment.class
})
public class AllGameTests 
{
}

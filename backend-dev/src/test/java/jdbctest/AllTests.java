package jdbctest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AddressPersistenceTest.class, AnimalPersistenceTest.class, ExercisesQueriesTest.class,
		PersistenceTest.class, PersonPersistenceTest.class })
public class AllTests {

}

package jdbc;

import java.sql.Connection;

import gson.Person;

public class PersonPersistence {
	
	private static String tableName = "person";
	private static String primaryKey = "id";
	
	private PersonPersistence() {}

	public static void insertPerson(Person person, Connection conn)  {
		String[] objectFieldsNames = {"name", "id", "salary", "registration_date"};
		Object[] fieldsValues = {person.getName(), person.getId(), person.getSalary(), person.getRegistrationDate()};
		Persistence.insertObject(tableName, objectFieldsNames, fieldsValues, conn);
	}
	
	public static <T> int updatePerson(Integer id, String[] fieldsToUpdate, T[] valuesToUpdateWith, Connection conn) {
		return Persistence.updateObject(tableName, primaryKey, id, fieldsToUpdate, valuesToUpdateWith, conn);
	}
	
	public static int deletePerson(Integer id, Connection conn) {
		return Persistence.deleteObject(tableName, primaryKey, id, conn);
	}
}
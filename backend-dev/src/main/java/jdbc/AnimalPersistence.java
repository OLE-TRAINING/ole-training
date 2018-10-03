package jdbc;

import java.sql.Connection;

public class AnimalPersistence {

	private static String tableName = "animal";
	private static String primaryKey = "id";
	
	private AnimalPersistence() {}

	public static void insertAnimal(Animal animal, Connection conn)  {
		String[] fields = {"id", "name", "type", "age", "owner_id"};
		Object[] fieldsValues = {animal.getId(), animal.getName(), animal.getType(), animal.getAge(), animal.getOwner().getId()};
		Persistence.insertObject(tableName, fields, fieldsValues, conn);
	}
	
	public static <T> int updateAnimal(Integer id, String[] fieldsToUpdate, T[] valuesToUpdateWith, Connection conn) {
		return Persistence.updateObject(tableName, primaryKey, id, fieldsToUpdate, valuesToUpdateWith, conn);
	}
	
	public static int deleteAnimal(Integer id, Connection conn) {
		return Persistence.deleteObject(tableName, primaryKey, id, conn);
	}
}

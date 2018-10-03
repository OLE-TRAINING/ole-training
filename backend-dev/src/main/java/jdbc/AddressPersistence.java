package jdbc;

import java.sql.Connection;

public class AddressPersistence {
	
	private static String tableName = "address";
	private static String primaryKey = "id";

	private AddressPersistence() {}
	
	public static void insertAddress(Address address, Connection conn) {
		String[] fields = {"public_place", "id", "number", "postal_code", "city", "state", "neighborhood"};
		Object[] fieldsValues = {address.getPublicPlace(), address.getId(), address.getNumber(), address.getPostalCode(),
				address.getCity(), address.getState(), address.getNeighborhood()};
		Persistence.insertObject(tableName, fields, fieldsValues, conn);
	}
	
	public static <T> int updateAddress(Integer id, String[] fieldsToUpdate, T[] valuesToUpdateWith, Connection conn) {
		return Persistence.updateObject(tableName, primaryKey, id, fieldsToUpdate, valuesToUpdateWith, conn);
	}
	
	public static int deleteAddress(Integer id, Connection conn) {
		return Persistence.deleteObject(tableName, primaryKey, id, conn);
	}
}
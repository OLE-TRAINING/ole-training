package jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ExercisesQueries {
	
	private ExercisesQueries() {
	}

	private static String buildGetPersonAddressQuery(Integer id) {
		return "select address.* from person inner join address on person.id = address.dweller_id where person.id = "
				+ id;
	}

	public static Address getPersonAddress(Integer id, Statement stmt) throws SQLException {
		String query = buildGetPersonAddressQuery(id);
		ResultSet rs = Persistence.executeQuery(stmt, query);

		Address address = null;
		rs.next();
		address = new Address();
		address.setPublicPlace(rs.getString("public_place"));
		address.setId(rs.getInt("id"));
		address.setNumber(rs.getString("number"));
		address.setPostalCode(rs.getString("postal_code"));
		address.setCity(rs.getString("city"));
		address.setState(rs.getString("state"));
		address.setNeighborhood(rs.getString("neighborhood"));
		return address;
	}

	private static String buildPersonsListOfAnimalsQuery(Integer id) {
		return "select animal.* from person inner join animal on person.id = animal.owner_id where person.id = " + id;
	}

	public static List<Animal> getPersonsListOfAnimals(Integer id, Statement stmt) throws SQLException {
		String query = buildPersonsListOfAnimalsQuery(id);
		ResultSet rs = Persistence.executeQuery(stmt, query);

		List<Animal> personsListOfAnimals = new ArrayList<>();
		Animal animal = null;
		while (rs.next()) {
			animal = new Animal();
			animal.setAge(rs.getInt("age"));
			animal.setId(rs.getInt("id"));
			animal.setName(rs.getString("name"));
			animal.setType(rs.getString("type"));
			personsListOfAnimals.add(animal);
		}
		return personsListOfAnimals;
	}

	private static String buildAnimalBelongsToPersonQuery(Integer animalId, Integer personId) {
		return "select count(*) as animalBelongsToPerson from animal where animal.owner_id = " + personId
				+ " and animal.id = " + animalId;
	}

	public static boolean animalBelongsToPerson(Integer animalId, Integer personId, Statement stmt)
			throws SQLException {
		String query = buildAnimalBelongsToPersonQuery(animalId, personId);
		ResultSet rs = Persistence.executeQuery(stmt, query);

		boolean animalBelongsToPerson = false;
		int countTuples = 0;
		rs.next();
		countTuples = rs.getInt("animalBelongsToPerson");
		if (countTuples == 1) {
			animalBelongsToPerson = true;
		}
		return animalBelongsToPerson;
	}

	public static int associateAnimalFromOnePersonToAnother(Integer receiverPersonId, Integer animalId, Statement stmt)
			throws SQLException {
		String[] field = { "owner_id" };
		Integer[] value = { receiverPersonId };
		return AnimalPersistence.updateAnimal(animalId, field, value, stmt.getConnection());
	}
}
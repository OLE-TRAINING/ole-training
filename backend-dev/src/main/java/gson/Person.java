package gson;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jdbc.Address;
import jdbc.Animal;

// topic 1
public class Person {

	private String name;
	@Exclude
	private Integer id;
	private BigDecimal salary;
	private LocalDate registrationDate;
	private Address address;
	private List<Animal> animals = new ArrayList<>();

	public Person() {}

	public Person(String name, Integer id, BigDecimal salary, LocalDate registrationDate) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.registrationDate = registrationDate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getName() {
		return name;
	}

	public Integer getId() {
		return id;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public String toString() {
		return getName() + ", " + getId() + ", " + getSalary() + ", " + getRegistrationDate();
	}

	public void addAnimal(Animal animal) {
		this.animals.add(animal);
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
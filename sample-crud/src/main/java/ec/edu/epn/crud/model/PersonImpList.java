package ec.edu.epn.crud.model;

import java.util.ArrayList;
import java.util.List;

public class PersonImpList implements IPersonDAO {

	private List<PersonDTO> persons;

	public PersonImpList() {
		this.persons = new ArrayList<>();
	}

	@Override
	public boolean addPerson(PersonDTO p) {
		return this.persons.add(p);
	}

	@Override
	public boolean deletePerson(int id) {
		List<PersonDTO> data = findAllPerson();
		int index = 0;
		for (PersonDTO person : data) {
			index = data.indexOf(person);
			if (person.getId() == id) {
				data.remove(index);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updatePerson(PersonDTO p, int id) {
		List<PersonDTO> data = findAllPerson();
		int index = 0;
		for (PersonDTO person : data) {
			index = data.indexOf(person);
			if (person.getId() == id) {
				data.set(index, p);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<PersonDTO> findAllPerson() {
		return this.persons;
	}

	@Override
	public PersonDTO findPersonById(int id) {
		List<PersonDTO> data = findAllPerson();
		PersonDTO result = null;
		for (PersonDTO person : data) {
			if (person.getId() == id) {
				result = person;
			}
		}
		return result;
	}

}

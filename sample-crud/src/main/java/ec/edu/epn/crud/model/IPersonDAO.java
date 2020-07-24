package ec.edu.epn.crud.model;

import java.util.List;

public interface IPersonDAO {

	public boolean addPerson(PersonDTO p);

	public boolean deletePerson(int id);

	public boolean updatePerson(PersonDTO p, int id);

	public List<PersonDTO> findAllPerson();

	public PersonDTO findPersonById(int id);
}

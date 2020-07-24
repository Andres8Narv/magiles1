package ec.edu.epn.crud.view;

import ec.edu.epn.crud.model.IPersonDAO;
import ec.edu.epn.crud.model.PersonDTO;
import ec.edu.epn.crud.model.PersonImpList;
import ec.edu.epn.crud.model.PesonImplMySQL;

public class PersonView {

	public static void main(String[] args) {
		IPersonDAO p = new PersonImpList();
		
		System.out.println("** INTERFAZ PRESTAMO **");
		p.addPerson(new PersonDTO(1, "Ricardo", "Falcón"));
		p.addPerson(new PersonDTO(2, "Andrés", "Narváez"));
		p.addPerson(new PersonDTO(3, "Thiago", "Neymar"));
		
		System.out.println("\n** Usuarios**");
		for (PersonDTO person : p.findAllPerson()) {
			System.out.println(person);
		}
		
		System.out.println("\n** READ PERSON BY ID 3 **");
		System.out.println(p.findPersonById(3));
		
		System.out.println("\n** UPDATE PERSON BY ID 3 **");
		System.out.println(p.updatePerson(new PersonDTO(3, "Luis", "Portuno"), 3));
		System.out.println("=> READ PERSON BY ID 3");
		System.out.println(p.findPersonById(3));

		System.out.println("\n** DELETE **");
		System.out.println("=> READ ALL");
		for (PersonDTO person : p.findAllPerson()) {
			System.out.println(person);
		}
		System.out.println("=> DELETE PERSON BY ID 1");
		System.out.println(p.deletePerson(1));
		System.out.println("=> PRINT ALL");
		for (PersonDTO person : p.findAllPerson()) {
			System.out.println(person);
		}
		
	}

}

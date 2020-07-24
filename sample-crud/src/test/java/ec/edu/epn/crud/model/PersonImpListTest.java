package ec.edu.epn.crud.model;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class PersonImpListTest {

	private static IPersonDAO person;
	
	@BeforeClass
	public static void breforePersonClass() {
		person = new PersonImpList();
	}
	
	@Test
	public void testAddPerson() {
		assertTrue(person.addPerson(new PersonDTO(1, "Jesé","Reyes")));
	}
	
	@Test
	public void testReadAllPerson() {
		person.addPerson(new PersonDTO(1, "Jesé","Reyes"));
		person.addPerson(new PersonDTO(2, "Ana","Leon"));
		assertEquals(2, person.findAllPerson().size());
		
	}
	
	@AfterClass
	public static void afterPersonClass() {
		person = null;
	}

}

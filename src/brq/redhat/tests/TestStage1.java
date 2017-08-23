package brq.redhat.tests;

import static org.assertj.core.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.Test;

import brq.redhat.main.Stage1;
import brq.redhat.model.Accountant;
import brq.redhat.model.Person;

public class TestStage1 {
	
	private static final String PERSON_NAME = "Rodriguez";
	private static final int AGE = 22;
	private Person p = Stage1.preparePerson(PERSON_NAME, AGE);


	@Test
	public void testPreparingPerson() {
		assertThat(p)
                    .as("The Stage1.preparePerson method returns null when it is not implemented. It should return a Person instance")
                    .isNotNull();

		assertThat(p.getName())
                    .as("The Person.getName() method is unimplemented. It should return set name.")
                    .isEqualTo(PERSON_NAME);
    }
	
	@Test
	public void testPersonGreetings() {
		assertThat(p.greetings())
                    .as("The greeting String should contain %s",PERSON_NAME)
                    .contains(PERSON_NAME);
	}
	
	@Test
	public void testAccountantTax() {
		Accountant a = new Accountant();
		
		BigDecimal givenSalary = new BigDecimal(1000);
		double tax = 0.1; //10%
		a.setSalary(givenSalary);
		
		assertThat(a.countTaxes(givenSalary, tax))
                    .as("Counting taxes out of set, external salary.")
                    .isEqualTo(100.0);

		assertThat(a.countTaxes(null, tax))
                    .as("Counting taxes out of its own salary.")
                    .isEqualTo(100.0);
	}

}

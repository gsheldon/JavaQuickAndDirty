package brq.redhat.tests;

import brq.redhat.main.Stage1;
import brq.redhat.model.CoffeeMachine;
import brq.redhat.model.Person;
import brq.redhat.model.RedHat;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestStage2 {

	private RedHat brq = new RedHat();
	private final Person PERSON_CAN_ENTER = Stage1.preparePerson("Klara", 18);
	private final Person PERSON_CANNOT_ENTER = Stage1.preparePerson("Rolando", 18);


	@Test
	public void testCanEnter() {

		assertThat(brq.canEnter(PERSON_CAN_ENTER))
				.as("Klara should be able to enter the building.")
				.isEqualTo(true);

		assertThat(brq.canEnter(PERSON_CANNOT_ENTER))
				.as("Rolando is not an employee and should not be able to enter the building")
				.isEqualTo(false);
	}

	@Test
	public void testCoffeePreparation(){
		CoffeeMachine emptyMachine = new CoffeeMachine();
		CoffeeMachine fullMachine = new CoffeeMachine();
		fullMachine.refill();

		CoffeeMachine jammedMachine = new CoffeeMachine();
		jammedMachine.refill();
		jammedMachine.refill();

		assertThat(brq.makeCoffee(PERSON_CAN_ENTER, fullMachine))
				.as("Full machine, person can enter, should return true")
				.isEqualTo(true);

		assertThat(brq.makeCoffee(PERSON_CAN_ENTER, emptyMachine))
				.as("Empty machine, but person that can enter should refill it; should return true")
				.isEqualTo(true);

		assertThat(brq.makeCoffee(PERSON_CAN_ENTER, jammedMachine))
				.as("This is a jammed machine, no one should be able to make coffee; return false")
				.isEqualTo(false);

		assertThat(brq.makeCoffee(PERSON_CANNOT_ENTER,fullMachine))
				.as("Person cannot enter -> no matter the machine, return false")
				.isEqualTo(false);

		assertThat(brq.makeCoffee(PERSON_CANNOT_ENTER,emptyMachine))
				.as("Person cannot enter -> no matter the machine, return false")
				.isEqualTo(false);

		assertThat(brq.makeCoffee(PERSON_CANNOT_ENTER,jammedMachine))
				.as("Person cannot enter -> no matter the machine, return false")
				.isEqualTo(false);
	}


}

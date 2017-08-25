package brq.redhat.model;

import brq.redhat.main.Stage1;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Properties;

public class RedHat {
	private static HashSet<Person> database = new HashSet<>();

	static {
		loadDatabase();
	}


	public boolean canEnter(Person p) {
		// TODO: Implement a check against the database object
		// The database has been loaded up for you with a set of people who can enter.
		// At this moment, no one can enter the Red Hat building.
		// You should iterate through the database,
		// Use the .equals method on each person,
		// And check whether Person p is in the database object.
		// If yes, return true.
		// Otherwise, return false.



		return false;
	}

	public boolean makeCoffee(Person p, CoffeeMachine coffeeMachine){
		// TODO: Given person P, you should 1) find out if the person can enter the building, and 2) if so, make coffee
		// First, use the canEnter method to check if Person p can enter the building.
		// if not, return false.
		// If the person can enter, try to make coffee with the coffeeMachine  object.
		// If coffeeMachine.makeCoffee returns false, this means it's out of coffee, (or jammed).
		// If it is out of coffee, you need to refill it using the coffeeMachine.refill() method.
		// However, be wary of just using the refill method all the time. The coffee machine jams if you refill it with more than 10 coffee grounds.

		// If the person can enter and the coffee machine made coffee, return true.
		// If the person can enter and the coffee machine is jammed, return false.


		return false;
	}


	private static void loadDatabase() {
		Properties prop = new Properties();
		try (InputStream input = new FileInputStream("db.properties")) {
			prop.load(input);
			Enumeration<?> keys = prop.propertyNames();
			while (keys.hasMoreElements()) {
				String name = (String) keys.nextElement();
				int age = Integer.parseInt(prop.getProperty(name));
				database.add(Stage1.preparePerson(name, age));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package brq.redhat.main;

import brq.redhat.model.Person;

public class Stage1 {
	
	public static Person preparePerson(String name, int age) {
		Person p = null;
		// TODO: Implement this method stub
		// First, open brq.redhat.main.Person and finish implementing the class

		// Then, create a new instance of the person object
		p = new Person();
		// Set the name and age variables to the person instance
		p.setAge(age);
		p.setName(name);
		// returning p that should be instantiated and set by now
		return p;
	}
	

}

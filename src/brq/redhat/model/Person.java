package brq.redhat.model;

import java.math.BigDecimal;

public class Person {
	protected String name;
	protected int age;
	protected BigDecimal salary;
	
	
	public String getName() {
		// TODO: Implement getter for name
		// this method should return the name of the current instance of this class
		// currently, it always returns Mark
		// Do not hard code a name; rather, return the instance 'name' variable

		return "Mark";
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	public String greetings() {
		// TODO: Implement this method to return a text (String) which uses the class name
		// For example, if you set the person's name to Rodriguez, it should say 
		// Hello, my name is Rodriguez
		return "Bite my shiny metal ass.";
	}


    @Override
    public boolean equals(Object p) {
	    if( !(p instanceof Person) ){
	        return false;
        }

        return this.name.equals( ((Person)p).getName() ) && this.age == ((Person)p).getAge();
    }
}

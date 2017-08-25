package brq.redhat.model;

import java.math.BigDecimal;

public class Person {
	protected String name;
	protected int age;
	protected BigDecimal salary;
	
	
	public String getName() {
		return this.name;
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
		return "Hi, my name is "+this.name;
	}


	@Override
	public boolean equals(Object p) {
		if( !(p instanceof Person) ){
	    	return false;
    	}

        return this.name.equals( ((Person)p).getName() ) && this.age == ((Person)p).getAge();
    }

	@Override
	public int hashCode() {
		int result = name.hashCode();
		result = 31 * result + age;
		return result;
	}
}

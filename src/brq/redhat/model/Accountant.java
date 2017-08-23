package brq.redhat.model;

import java.math.BigDecimal;

public class Accountant extends Person {
	
	public double countTaxes(BigDecimal givenSalary, double tax) {
		
		BigDecimal salaryToCount = givenSalary;
		if(salaryToCount == null) {
			salaryToCount = this.salary;
		}
		
		// Multiply the salaryToCount with tax
		// The tax variable is a double. You need to transform it into a BigDecimal
		// BigDecimal can be created from a double as follows: new BigDecimal(doubleValue)

		BigDecimal bigDecimalTax = null;
		BigDecimal result = null;
		
		return result.doubleValue();
	}

}

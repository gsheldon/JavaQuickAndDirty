package brq.redhat.model;

import java.math.BigDecimal;

public class Accountant extends Person {
	
	public double countTaxes(BigDecimal givenSalary, double tax) {
		
		BigDecimal salaryToCount = givenSalary;
		if(salaryToCount == null) {
			salaryToCount = this.salary;
		}

		BigDecimal bigDecimalTax = new BigDecimal(tax);
		BigDecimal result = salaryToCount.multiply(bigDecimalTax);
		
		return result.doubleValue();
	}

}

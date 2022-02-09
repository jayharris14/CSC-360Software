package pay;


import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest
{
	Employee R;
	Employee J;
	Employee M;
	Employee Y;
	Employee A;
	Company Z;
	int hoursworked;
	
	
	@BeforeEach
	void setUp() throws Exception
	{
		R= new Employee("Bill", 10, 0, new Contractor());
		J = new Employee("Don", 12, 0, new Hourly());
		M = new Employee("Sarah", 10, 0, new Salary());
		Y = new Employee("Kate", 13, 0, new Hourly());
		R.sethoursworked(45);
		R.addemployee();
		R.performPay();
		J.sethoursworked(50);
		J.addemployee();
		J.performPay();
		M.sethoursworked(40);
		M.addemployee();
		M.performPay();
		Y.sethoursworked(45);
		Y.addemployee();
		Y.performPay();
	}

	@Test
	void test()
	{	
	
	
	}

	

}



package pay;

import java.util.ArrayList;



public class Employee
{

	Pay pay;
	String name;
	int hourlyrate;
	int hoursworked;
	
	
	
	
		Employee(String name, int hourlyrate, int hoursworked, Pay p)
	{
		this.name=name;
		this.hourlyrate=hourlyrate;
		this.hoursworked=hoursworked;
		this.pay=p;
	}
		
		public void addemployee()
		{	
			ArrayList<Employee> Company= new ArrayList<Employee>();
			Company.add(this);
			System.out.println(Company);
		}
		
		
	


	public void sethoursworked(int hoursworked){
		this.hoursworked=hoursworked;
	}

	public float performPay() {
		float x=pay.pay(hoursworked, hourlyrate);
		ArrayList<Float> payroll= new ArrayList<Float>();
		payroll.add(x);
		System.out.println(payroll);
		return x;
	}
	

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return the hourlyrate
	 */
	public int getHourlyrate()
	{
		return hourlyrate;
	}

	/**
	 * @param hourlyrate the hourlyrate to set
	 */
	public void setHourlyrate(int hourlyrate)
	{
		this.hourlyrate = hourlyrate;
	}

	/**
	 * @return the hoursworked
	 */
	public int getHoursworked()
	{
		return hoursworked;
	}

	/**
	 * @param hoursworked the hoursworked to set
	 */
	public void setHoursworked(int hoursworked)
	{
		this.hoursworked = hoursworked;
	}
	
	
	
	
	
}

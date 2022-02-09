package pay;

public class Contractor implements Pay
{
	public float pay(int hoursworked, int hourlyrate) {
		
		float x=hoursworked*hourlyrate;
		
		return x;
		
	}
}

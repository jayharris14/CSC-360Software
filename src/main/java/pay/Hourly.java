package pay;

public class Hourly implements Pay
{
	public float pay(int hoursworked, int hourlyrate) {
		float x = 0;
		if (hoursworked>40){
			float y=hoursworked-40;
			x=hourlyrate*40;
			float z=(float) (hourlyrate*1.5);
			x=x+(z*y);
		
		}
		return x;
		
	
	}
}

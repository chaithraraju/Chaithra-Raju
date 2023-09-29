package demo.com.acaders;


class plane
{
	void takeoff()
	{
		System.out.println("plane is taking off");
	}
	void fly()
	{
		System.out.println("plane is flying");
	}
	void land()
	{
		System.out.println("plane is landing");
	}
}
class passengerplane extends plane
{
	
}
	class cargoplane extends plane
	{
		
	}
	class fighterplane extends plane
	{
		
	}
public class launchplane 
{
public static void main(String []args)
{
	passengerplane pp = new passengerplane();
	cargoplane cp = new cargoplane();
	fighterplane fp = new fighterplane();
	
	pp.takeoff();
	pp.fly();
	pp.land();
	
	cp.takeoff();
	cp.fly();
	cp.land();
	
	fp.takeoff();
	fp.fly();
	fp.land();
	
}
}

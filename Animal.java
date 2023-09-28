package constructor;

class launch
{
	void eating()
	{
		System.out.println("animal is eating");
	}
	void sleeping()
	{
		System.out.println("animal is sleeping");
	}
}
class Deer extends launch
{
	void eating()
	{
		System.out.println("Deer is eating");
	}
	void sleeping()
	{
		System.out.println("Deer is sleeping");
	}
}
class Tiger extends launch
{
	void eating()
	{
		System.out.println("Tiger is eating");
	}
	void sleeping()
	{
		System.out.println("Tiger is sleeping");
	}
}
class Monkey extends launch
{
	void eating()
	{
		System.out.println("Monkey is eating");
	}
	void sleeping()
	{
		System.out.println("Monkey is sleeping");
	}
}
public class Animal
{
public static void main(String[] args)
{
	Deer d = new Deer();
Tiger t = new Tiger();
Monkey m = new Monkey();

d.eating();
d.sleeping();

t.eating();
t.sleeping();

m.eating();
m.sleeping();
}
}

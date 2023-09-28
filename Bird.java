package constructor;


class bird1
{
	void eat()
	{
		System.out.println("Bird is eating");
	}
	void fly()
	{
		System.out.println("Bird isflying");
	}
}
class Eagle extends bird1
{
	void eat()
	{
		System.out.println("Bird is eating");
	}
	void fly()
	{
		System.out.println("Bird isflying");
	}
}

class Sparrow extends bird1
{
	void eat()
	{
		System.out.println("Bird is eating");
	}
	void fly()
	{
		System.out.println("Bird isflying");
	}
}
class vegSparrow extends Sparrow
{
	void eat()
	{
		System.out.println("veg Sparrow will only eat grains ");
	}
	void fly()
	{
		System.out.println("veg Sparrow flies very slow");
	}
}
	class nonvegSparrow extends Sparrow
	{
		void eat()
		{
			System.out.println("non veg Sparrow will only eat insects");
		}
		void fly()
		{
			System.out.println("non veg Sparrow flies very fast");
		}
	}
 class mountainEagle extends Eagle
		{
			void eat()
			{
				System.out.println("mountain Eagle eats insects");
			}
			void fly()
			{
				System.out.println("mountain Eagle flies over the mountain");
			}	
}
 class oceanEagle extends Eagle
	{
		void eat()
		{
			System.out.println("ocean Eagle eats fishes");
		}
		void fly()
		{
			System.out.println("ocean Eagle flies over the oceans");
		}	
}



public class Bird 
{

	public static void main(String[] args)
	{
		vegSparrow vs = new vegSparrow();
		nonvegSparrow nvs = new nonvegSparrow();
		mountainEagle me = new mountainEagle();
		oceanEagle oe = new oceanEagle();
		
		
		Extra.letFree(vs);
		Extra.letFree(nvs);
		Extra.letFree(me);
		Extra.letFree(oe);
		

	}

}
class Extra 
{
static void letFree(bird1 b)
{
	b.eat();
	b.fly();
}
}

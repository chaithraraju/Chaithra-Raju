package collectionpractice;

import java.util.LinkedHashSet;

public class LinkedHashSetExmp {

	public static void main(String[] args)
	{
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(50);
		lhs.add(150);
		lhs.add(25);
		lhs.add(75);
		lhs.add(125);
		lhs.add(100);
		lhs.add(175);
		System.out.println(lhs);
		lhs.add(175);
		System.out.println(lhs);
	}

}

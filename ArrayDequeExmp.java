package collectionpractice;

import java.util.ArrayDeque;

public class ArrayDequeExmp {

	public static void main(String[] args) 
	{
		
    ArrayDeque ad = new ArrayDeque();
     ad.add(10);
     ad.add(20);
     ad.add(30);
     ad.add(40);
     ad.add(50);
     ad.add(60);
     System.out.println(ad);
     System.out.println(ad.offer(555));
     System.out.println(ad);
	}

}

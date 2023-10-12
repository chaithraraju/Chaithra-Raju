package collectionpractice;

import java.util.LinkedList;

public class LinkedListExmp 
{
public static void main(String[] args) {
	LinkedList ll = new LinkedList();
	ll.add(10);
	ll.add(20);
	ll.add(30);
	ll.add(40);
	System.out.println(ll);
	ll.add(1,50);
	System.out.println(ll);
	ll.addFirst(100);
	System.out.println(ll);
	ll.addLast(900);
	System.out.println(ll);
	System.out.println(ll.get(4));
	System.out.println("Is LL Empty?: "+ll.isEmpty());
	System.out.println(ll.peek());//copy the first element//
	System.out.println(ll);
	System.out.println(ll.poll());//copy the lat element//
	System.out.println(ll);
}
}

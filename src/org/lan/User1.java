package org.lan;

import java.util.LinkedList;
import java.util.List;

public class User1 {

public static void main(String[] args) {
	
	List<Integer> l1=new LinkedList<>();
	List<Integer> l2=new LinkedList<>();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	l1.add(20);
	l1.add(15);
	l1.add(10);
	l2.add(100);
	l2.add(150);
	l2.add(100);
	l2.add(30);
	System.out.println(l1);
	for(Integer x:l1)
	{
		System.out.println(x);
	}
	l1.addAll(l2);
	System.out.println(l1);
	l2.retainAll(l1);
	System.out.println(l2);
	l2.removeAll(l1);
	System.out.println(l2);
}

}

package org.lan;

import java.util.ArrayList;
import java.util.List;

public class User {

	public static void main(String[] args) {
		
	List<Employee> li= new ArrayList<>();
	
	Employee e1=new Employee();
	e1.setId(1);
	e1.setName("Bala");
	e1.setPhno(9790939352l);
	
	Employee e2=new Employee();
	e2.setId(2);
	e2.setName("Krishnan");
	e2.setPhno(9092998981l);
	
	Employee e3=new Employee();
	e3.setId(3);
	e3.setName("BK");
	e3.setPhno(123456789l);
	
	li.add(e1);
	li.add(e2);
	li.add(e3);
	
	for(int i=0;i<li.size();i++)
	{
	System.out.println("Id is:"+li.get(i).getId());
	System.out.println("Name is:"+li.get(i).getName());
	System.out.println("Phone Number is:"+li.get(i).getPhno());
	}
}

}
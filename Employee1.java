
	import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
	public class Employee1 {
		String name="";
		int n=0;
		static LinkedList a1=new LinkedList();
		Employee1(String name,int n)
		{
			this.name=name;
			this.n=n;
		}
	public static void main(String args[])
	{
		while(true)
		{
		System.out.println("enter your choice");
		System.out.println("1.add"+" "+"2.delete"+" "+"3.show"+" "+"4.listall"+" "+"5.exit");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		switch(n)
		{
		case 1:System.out.println("enter name");
		       String g=s.next();
		       System.out.println("enter id");
		       int n1=s.nextInt();
		       Employee e=new Employee(g,n1);
		       add(e);
		       break;
		case 2:System.out.println("enter id");
		       int n2=s.nextInt();
		       delete(n2);
		       break;
		case 3:System.out.println("enter id");
		       int n3=s.nextInt();
		       show(n3);
		       break;
		case 4:showall();
		       break;
		case 5:System.exit(0);
		}
		}
	}
	static void add(Employee e)
	{
		a1.add(e);
		System.out.println("added");
	}
	static void delete(int n)
	{
		Iterator i3=a1.iterator();
		while(i3.hasNext())
		{
			Employee1 e2=(Employee1)i3.next();
			if(e2.n==n)
			{
				a1.remove(e2);
				break;
			}
		}
		System.out.println("deleted");
	}
	static void show(int n)
	{
		Iterator i3=a1.iterator();
		while(i3.hasNext())
		{
			Employee1 e2=(Employee1)i3.next();
			int n2=e2.n;
			if(n2==n)
				System.out.println(e2.name+" "+e2.n);
		}
	}
	static void showall()
	{
		Iterator i3=a1.iterator();
		while(i3.hasNext())
		{
			Employee1 e2=(Employee1)i3.next();
			
				System.out.println(e2.name+" "+e2.n);
		}
	}
	}


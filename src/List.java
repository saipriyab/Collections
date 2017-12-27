import java.util.*;
public class List {
public static void main(String args[])
{
	LinkedList s=new LinkedList();
	while(true)
	{
	System.out.println("1.Insert");
	System.out.println("2.Search");
	System.out.println("3.delete");
	System.out.println("4.Display");
	System.out.println("5.Exit");
	Scanner s1=new Scanner(System.in);
	int choice=s1.nextInt();
	switch(choice)
	{
	case 1:System.out.println("Enter item to be searched");
	       String k=s1.next();
	       s.add(k);
	       System.out.println("Inseted successfully");
	       break; 
	case 2:System.out.println("Enter the item to be searched");
	       String k1=s1.next();
	      if(s.contains(k1))
	       System.out.println("Item is found in the list");
	       else
	       System.out.println("Item not found in the list");
	       break;	
	case 3:System.out.println("Enter the item to be deleted");
	       String k3=s1.next();
	       s.remove(k3);
	       break;
	case 4:Iterator i3=s.iterator();
	       while(i3.hasNext())
	    	System.out.println(i3.next());
	       break;
	case 5:System.exit(0);
	}
	}
	
}

}

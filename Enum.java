import java.util.*;
public class Enum {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	Vector v1=new Vector();
	System.out.println("enter");
	int n=s.nextInt();
	System.out.println("enter");
	for(int i=0;i<n;i++)
	{
		v1.add(s.next());
	}
	Enumeration e1=v1.elements();
	while(e1.hasMoreElements())
	{
		System.out.println(e1.nextElement());
	}
	
}
}

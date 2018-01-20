import java.util.*;
public class Sort {
public static void main(String args[])
{
	List a1=new ArrayList();
	Scanner s=new Scanner(System.in);
	System.out.println("enter");

    Comparator comparator = Collections.reverseOrder();
   
	int t=s.nextInt();
	for(int i=0;i<t;i++)
		a1.add(s.nextInt());
	Collections.sort(a1,comparator);
	Iterator i2=a1.iterator();
	while(i2.hasNext())
		System.out.println(i2.next());
	
}
}

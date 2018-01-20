import java.util.*;
public class Even {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter");
	int n=s.nextInt();
	ArrayList a1=new ArrayList();
	ArrayList a2=saveEvenNumber(n,a1);
	printEvenNumbers(a2);
	
		
	
}
static ArrayList saveEvenNumber(int n,ArrayList a1)
{
	for(int i=0;i<=n;i++)
	a1.add(i);
	return a1;
}
static void printEvenNumbers(ArrayList a2)
{
	ArrayList a4=new ArrayList();
	Iterator i3=a2.iterator();
   while(i3.hasNext())
		a4.add(i3.next());
   Iterator i4=a4.iterator();
   while(i4.hasNext())
   {
	   int k=(Integer)i4.next();
	   System.out.println(k*2);
   }
}
}

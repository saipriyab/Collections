import java.util.*;
public class Cookie {
	
	
	    public static void main(String args[] ) throws Exception {
	      Scanner s=new Scanner(System.in);
	      System.out.println("enter");
	      int n=s.nextInt();
	      int a[]=new int[n];
	      LinkedHashSet a1=new LinkedHashSet();
	      for(int j=0;j<n;j++)
	      {
	          a[j]=s.nextInt();
	          a1.add(a[j]);
	      }
	      int count=0;
	           Iterator i2=a1.iterator();
	           while(i2.hasNext())
	           {
	               count=0;
	               int k=(Integer)i2.next();
	               for(int k1=0;k1<a.length;k1++)
	               {
	                   if(a[k1]==k)
	                   count++;
	               }
	               if(count%2!=0)
	               System.out.print(k+" ");
	           }
	    }
	}

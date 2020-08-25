import java.util.*;
public class Main
{
	public static void main(String[] args) {
       int n,o=0,e=0,r;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
         while(n>0){
             r=n%10;
           if(r%2==0)
               e++;
           else 
             o++;
        n=n/10;
       }
       System.out.println("Even :"+""+e);
	   System.out.println("Odd :"+""+o);
	    
	}
}

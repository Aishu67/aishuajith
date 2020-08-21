import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        int i,n,p=0;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
     if((n>2) && (n%2==0))
        p=0;
     else{
         p=1;
         for(i=2;i<n;i++){
        
             if(n%i==0){
              p=0;
              break;
             }
             else
              p=1;
         }
     }
     
   if(p==1)
     System.out.println("Prime");
   else
   System.out.println("Not Prime");
    }
}

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in); 
	     int n,s,val,c=0,i,j,x;
	     n=sc.nextInt();
         int arr[]=new int[n];
         s=sc.nextInt();
         for(i=0;i<n;i++){
             arr[i]=sc.nextInt();
         }
       System.out.println(arr[0]+"ref");
         for(x=0;x<n;x++){
              System.out.println(arr[x]+"ref");
             val=arr[x]-s;
              System.out.println(val+"val");
             for(j=0;j<n;j++){
                 if(val==arr[j]){
    
                  System.out.print(arr[x]+" "+val);
                  c=1;
                  break;
                 }
             }
          if(c==1){
           break;
         }
         }
        
	}
}

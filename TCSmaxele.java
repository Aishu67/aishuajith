import java.util.*;
public class Main{
    public static void main(String av[]){
        Scanner sc=new Scanner(System.in);
        
        int n,i,max;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       max= Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
        
        
        } 

}

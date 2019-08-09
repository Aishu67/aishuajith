import java.util.*;
public class Main{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    LinkedHashSet<Integer> hs=new LinkedHashSet();
    int i,n,val;
    n=sc.nextInt();
    
    for(i=0;i<n;i++){
        val=sc.nextInt();
        hs.add(val);
    }
    //System.out.println(hs);
    for(Integer x:hs){
        System.out.print(x+" ");
    }
}
}

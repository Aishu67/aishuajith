import java.util.*;
public class Main{
    public static void main(String args[]){
        int n,l,i,j,c=0,p=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        l=sc.nextInt();
        for(i=n;i<=l;i++){
            p=0;
            if(i==2){
                p=1;
            }
            else{
            for(j=2;j<i;j++){
                if(i%j==0){
                    p=0;
                    break;
                }
                else{
                    p=1;
                     
                }
            }
         }
        if(p==1){
            c=c+1;
        }
        
        }
    System.out.println(c);
    }
}

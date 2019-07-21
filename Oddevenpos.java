import java.util.*;
public class Oddevenpos{
    public static void main(String args[]){
        int l,i;
        String s;
        StringBuilder sb=new StringBuilder();
        Scanner input=new Scanner(System.in);
        s=input.nextLine();
        l=s.length();
        for(i=0;i<l;i++){
            if(i%2==0){
                sb.append(s.charAt(i+1));
            }
            else{
                sb.append(s.charAt(i-1));
            }
            
        }
        System.out.println(sb);
        
        
        
        
        
    } 
}

import java.util.*;
public class Main{
    public static void main(String av[]){
        Scanner sc=new Scanner(System.in);
        int i;
        String s;
        StringBuilder sb=new StringBuilder();
            s=sc.nextLine();
            sb.append(s);
                    
                for(i=1;i<s.length();i++){
                    if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                        sb.deleteCharAt(i);
                        
                    }
                    
                }
                System.out.println(sb);
        
    }
}

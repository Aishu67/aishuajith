import java.util.*;
public class Main{
    public static void main(String arg[]){
        
        String s;
        int i;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        s=s.toLowerCase();
        
        char[] arr=s.toCharArray();
        arr[0]=Character.toUpperCase(arr[0]);
        for(i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                arr[i+1]=Character.toUpperCase(arr[i+1]);
            }
        }

            System.out.println(arr);
        
    }
}

import java.util.*;
import java.lang.*;
public class Main{
    public static void main(String av[]){
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        if(s==null ||s.isEmpty()){
            System.out.println("NULL");
        }
        String[] words=s.split("\\s+");
        System.out.println(words.length);
        //for(String i:words){
           // System.out.println(i);
       // }
    }
}

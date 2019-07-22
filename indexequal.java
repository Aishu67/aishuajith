import java.util.*;
public class Main {
    public static int c=0;
    public static void main(String ar[]){
        int n,i=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(i=0;i<n;i++){
            hm.put(i,sc.nextInt());
        }
        
        for(Map.Entry<Integer,Integer> j:hm.entrySet()){
       // System.out.print(j.getKey()+" "+j.getValue()+"\n");
            if(j.getKey()==j.getValue()){
                 al.add(j.getValue());
                 c=1;
           
            }
        }
        if(c==1){
            Collections.sort(al);
            for(Integer res:al){
            System.out.print(res+" ");
            }
        }
        else{
            System.out.print(-1);
        }
   } 
}

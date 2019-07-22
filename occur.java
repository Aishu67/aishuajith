import java.util.*;
public class Main{
    public static int u=0;
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        int i;
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> al=new ArrayList<Integer>();
    
       HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
       for(Integer en:arr){
           Integer j=hm.get(en);
           hm.put(en,(j==null) ? 1: j+1);
       }
       TreeMap<Integer,Integer> tm=new TreeMap<Integer,Integer>();
        tm.putAll(hm);
        for(Map.Entry<Integer,Integer> res:tm.entrySet()){
            if(res.getValue()>1){
                u=1;
             
               al.add(res.getKey());
              
            }
        }
        if(u==1){
        for(Integer p:al){
            System.out.print(p+" "); 
        }
        }
        else{
          System.out.println("unique");
        }
       }
        
    }

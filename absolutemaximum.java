
import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		ArrayList<Integer> res=new ArrayList<Integer>();
		int i,n,val;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<n;i++){
		    arr.add(sc.nextInt());
		}
		for(int x=0;x<n-1;x++){
		for(int j=x;j<n;j++){
		    val=Math.abs(arr.get(x)-arr.get(j))+Math.abs(x-(j));
		    res.add(val);
		}
		}
		System.out.println(Collections.max(res));
		
	}
}

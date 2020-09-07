import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j=0;
		String s=sc.nextLine();
		char[] c=s.toCharArray();
		char[] sa=new char[s.length()];
		for(i=s.length()-1;i>=0;i--){
		    sa[j]=c[i];
		    System.out.print(sa[j]);
		    j++;
		    
		}
		
		
	}
}

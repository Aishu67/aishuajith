import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        int i,n,m,j;
        n=sc.nextInt();
        m=sc.nextInt();
     
        int[][] arr1=new int[n][m];
        int[][] arr2=new int[n][m];
        
        int[][] res=new int[n][m];
        if(n==m){
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print(arr1[i][j]+arr2[i][j]+" ");
            }
            System.out.print("\n");
        }
        }
	}
}

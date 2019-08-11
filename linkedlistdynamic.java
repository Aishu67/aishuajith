import java.util.*;
public class Main{
    public static class LinkedList{
        int data;
        LinkedList next;
        
        LinkedList(int data){
            this.data=data;
            this.next=null;
        }
    }
    public LinkedList Insert(int data,LinkedList head){
      //LinkedList head;
        //int i=i;
    
    if(head==null){
        LinkedList headv=new LinkedList(data);
        head=headv;
        return head;
        
    }
    LinkedList cur=head;
    LinkedList newnode=new LinkedList(data);
    while(cur.next!=null){
        cur=cur.next;
    }
    cur.next=newnode;
    return head;
}
    public void display(LinkedList head){
        LinkedList cur=head;
        if(head==null){
            System.out.println("List is empty");
        }
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
    }
public static void  main(String arg[]){
    Scanner sc=new Scanner(System.in);
    int n,i,val;
    n=sc.nextInt();
     LinkedList first=null;
    Main obj=new Main();
    for(i=0;i<n;i++){
        val=sc.nextInt();
        first=obj.Insert(val,first);
        
        
    }
   // LinkedList head=new LinkedList(10);
    //LinkedList sc=new LinkedList(15);
    //LinkedList th=new LinkedList(1000);
    //LinkedList fr=new LinkedList(300);
    //LinkedList fi=new LinkedList(50);
    //LinkedList si=new LinkedList(67);
    //head.next=sc;
    //sc.next=th;
    //th.next=fr;
    //fr.next=fi;
    //fi.next=si;
    //Main obj=new Main();
    obj.display(first);
    
}  
}

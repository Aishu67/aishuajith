import java.util.*;
public class Main{
    //Display the datas
    public void display(Linkedlist head){
        if(head==null){
          System.out.print("List Empty");
          return;
        }
         else{
             Linkedlist cr=head;
             while(cr!=null){
                 System.out.print(cr.data+" ");
                 cr=cr.next;
             }
             System.out.println("\n");
         }
        
    }
    
    //Find Length
    public int listlength(Linkedlist head){
        int cnt=0;
        if(head==null){
            return 0;
        }
        else{
            Linkedlist cur=head;
            while(cur!=null){
                cnt=cnt+1;
                cur=cur.next;
            }
        
        }
        return cnt;
    }
    
    public Linkedlist BeginingInsert(Linkedlist head,int data){
        Linkedlist Newnode=new Linkedlist(data);
        if(head==null){
            return Newnode;
        }
        Newnode.next=head;
        head=Newnode;
        return head;
    }
    
    //insert at end 
    public Linkedlist insertend(Linkedlist head,int data){
        Linkedlist endnode=new Linkedlist(data);
        Linkedlist cur=head;
        if(head==null){
            return endnode;
        }
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=endnode;
        return head;
         
    }
    
    //Insert after given  node 
    public void insertafter(Linkedlist position,int data){
        if(position==null){
            System.out.print("Can't insert");
            return;
        }
        Linkedlist newnode=new Linkedlist(data);
        newnode.next=position.next;
        position.next=newnode;
    }
    
    //Insert in given position
    public void insertposition(int pos,int data,Linkedlist head){
        if(head==null){
            System.out.println("Can't insert");
        }
        Linkedlist newnode=new Linkedlist(data);
        Linkedlist cur=head;
        int c=1;
        while(c<pos-1){
            cur=cur.next;
            c=c+1;
        }
        newnode.next=cur.next;
        cur.next=newnode;
        }
        

    //Create the List
    public static class Linkedlist{
        int data;
        Linkedlist next;
        
        Linkedlist(int data){
            this.data=data;
            this.next=null;
        }
        
    }
    public static void main(String ag[]){
        Linkedlist head=new Linkedlist(6);
        Linkedlist sc=new Linkedlist(19);
        Linkedlist th=new Linkedlist(14);
        Linkedlist fr=new Linkedlist(67);
        head.next=sc;
        sc.next=th;
        th.next=fr;
        Main obj=new Main();
        obj.display(head);
       System.out.println("Length :"+obj.listlength(head));
        //Linkedlist newhead=obj.BeginingInsert(head,1998);
        //obj.display(newhead);
        head=obj.BeginingInsert(head,1998);
        obj.display(head);
        Linkedlist endnode=obj.insertend(head,1996);
        obj.display(endnode);
        obj.insertafter(sc,1000);
        obj.display(head);
       obj.insertposition(7,2000,head);
        obj.display(head);
    }
}

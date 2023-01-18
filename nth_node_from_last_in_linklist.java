import java.util.*;
class linklist{
    static node head;
    static class node{
        int data;
        node next;
        node(int n){
            this.data=n;
            this.next=null;
        }
    }
    public static void insert(int n){
        if(head==null){
            node newnode=new node(n);
            head=newnode;
        }
        else{
            node dummy=head;
            while(dummy.next!=null){
                dummy=dummy.next;
            }
            node newnode=new node(n);
            dummy.next=newnode;
        }
    }
    public static void print(){
        node dummy=head;
        while(dummy!=null){
            System.out.printf("%d --> ",dummy.data);
            dummy=dummy.next;
        }
        System.out.printf("null\n");
    }
    public static void fromLast(int n){
        node res=head;
        node ref=head;
        int count=0;
        while(count<n){
            ref=ref.next;
            count++;
        }
        while(ref!=null){
            ref=ref.next;
            res=res.next;
        }
        System.out.printf("The %d element from last is :%d",n,res.data);
    }
}
class HelloWorld {
    public static void main(String[] args) {
        linklist lnk=new linklist();
        lnk.insert(1);
        lnk.insert(2);
        lnk.insert(3);
        lnk.insert(4);
        lnk.insert(5);
        lnk.insert(6);
        lnk.insert(7);
        lnk.insert(8);
        lnk.insert(9);
        lnk.insert(10);
        lnk.print();
        lnk.fromLast(3);
    }
}

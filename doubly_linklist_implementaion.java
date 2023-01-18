import java.util.*;
class dll{
    static node head;
    static class node{
        int data;
        node next;
        node prv;
        node(int n){
            this.data=n;
            this.next=null;
            this.prv=null;
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
            newnode.prv=dummy;
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
}
class HelloWorld {
    public static void main(String[] args) {
        dll lnk=new dll();
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
    }
}

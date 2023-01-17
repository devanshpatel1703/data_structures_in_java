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
    public static void loop(){
        node dummy=head;
        while(dummy.data!=5){
            dummy=dummy.next;
        }
        node tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next=dummy;
    }
    public static boolean detectloop(){
        node fast=head;
        node slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
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
        lnk.loop();
        boolean check=lnk.detectloop();
        if(check==true){
            System.out.printf("Yes, loop is present.\n");
        }
        else{
            System.out.printf("No, loop is not present.\n");
        }
    }
}

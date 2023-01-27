import java.util.*;
class linklist{
    static node head;
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void insert(int data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
        }
        else{
            node dummy=head;
            while(dummy.next!=null){
                dummy=dummy.next;
            }
            dummy.next=newnode;
        }
    }
    public static void print(){
        node dummy=head;
        while(dummy!=null){
            System.out.printf("%d --> ",dummy.data);
            dummy=dummy.next;
        }
        System.out.printf("null");
    }
    public static void printReverse(){
        node dummy=head;
        printrev(dummy);
    }
    public static void printrev(node dummy){
        if(dummy==null){
            return;
        }
        printrev(dummy.next);
        System.out.printf("%d <-- ",dummy.data);
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
        System.out.printf("Initial linklist :\n");
        lnk.print();
        System.out.printf("\nPrinting linklist in reverse order (recuersively) :\n");
        lnk.printReverse();
    }
}

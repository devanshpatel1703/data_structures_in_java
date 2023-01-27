import java.util.*;
class queue{
    static node head;
    
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    public static void push(int data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
    }
    
    public static void pop(){
        node dummy=head;
        if(dummy==null){
            System.out.printf("Queue is already empty.\n");
            return;
        }
        else{
            if(dummy.next==null){
                System.out.printf("Popped :%d\n",dummy.data);
                dummy=null;
                return;
            }
            else if(dummy.next.next==null){
                System.out.printf("Popped :%d\n",dummy.next.data);
                dummy.next=null;
                return;
            }
            while(dummy.next.next!=null){
                dummy=dummy.next;
            } 
            System.out.printf("Popped :%d\n\n",dummy.next.data);
            dummy.next=null;
        }
    }
    
    public static void print(){
        node dummy=head;
        System.out.printf("Current QUEUE :\n");
        while(dummy!=null){
            System.out.printf("     | %d |\n",dummy.data);
            dummy=dummy.next;
        }
        System.out.printf("\n\n");
    }
    
}
class Main {
    public static void main(String[] args) {
        queue que=new queue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        que.print();
        que.pop();
        que.print();
        que.pop();
        que.print();
    }
}

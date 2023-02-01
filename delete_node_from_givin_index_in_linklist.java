class lnklst{
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
    public static void deleteAtIndex(int in){
        int c=2;
        node dummy=head;
        while(c<in){
            dummy=dummy.next;
            c++;
        }
        node newnode=dummy.next;
        newnode=newnode.next;
        dummy.next=newnode;
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
public class Main
{
	public static void main(String[] args) {
		lnklst ll=new lnklst();
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(4);
		ll.insert(5);
		ll.insert(6);
		ll.insert(7);
		ll.print();
		ll.deleteAtIndex(4);
		ll.print();
	}
}

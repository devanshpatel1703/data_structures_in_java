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
    public void insertAtLast(int a){
        node newnode=new node(a);
        node dummy=head;
        while(dummy.next!=null){
            dummy=dummy.next;
        }
        dummy.next=newnode;
    }
    public void insertAtIndex(int in,int a){
        in--;
        node newnode=new node(a);
        node dummy=head;
        while(in!=0){
            dummy=dummy.next;
            in--;
        }
        node newnode2=dummy;
        dummy=dummy.next;
        newnode2.next=newnode;
        newnode.next=dummy;
    }
    public static void display(){
        node dummy=head;
        while(dummy!=null){
            System.out.printf("%d --> ",dummy.data);
            dummy=dummy.next;
        }
        System.out.printf("null\n");
    }
    public static void main(String[] args){
        linklist lnklst=new linklist();
        lnklst.insert(1);
        lnklst.insert(2);
        lnklst.insert(3);
        lnklst.insert(4);
        lnklst.insert(5);
        lnklst.insert(6);
        lnklst.display();
        System.out.printf("After inserting node at 4th position.\n");
        lnklst.insertAtIndex(4,-1);
        lnklst.display();
    }
}

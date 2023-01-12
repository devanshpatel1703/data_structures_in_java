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
        System.out.printf("After inserting node at starting.\n");
        node newnode=new node(100);
        newnode.next=head;
        head=newnode;
        lnklst.display();
    }
}

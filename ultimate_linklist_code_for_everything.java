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
    public static void insertAtFirst(int a){
        node newnode=new node(a);
        newnode.next=head;
        head=newnode;
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
    public static void deleteHead(){
        head=head.next;
    }
    public static void deleteLastNode(){
        node dummy=head;
        while(dummy.next.next!=null){
            dummy=dummy.next;
        }
        dummy.next=null;
    }
    public static void deleteAtIndex(int a){
        node dummy=head;
        for(int i=a;i>=1;i--){
            if(i==1){
                break;
            }
            dummy=dummy.next;
        }
        dummy.next=dummy.next.next;
    }
    public static int searchElement(int a){
        int in=0;
        node dummy=head;
        while(dummy!=null){
            if(dummy.data==a){
                return in;
            }
            in++;
            dummy=dummy.next;
        }
        return -1;
    }
    public static void main(String[] args){
        linklist lnklst=new linklist();
        lnklst.insert(1);
        lnklst.insert(2);
        lnklst.insert(3);
        lnklst.insert(4);
        lnklst.insert(5);
        lnklst.insert(6);
        System.out.printf("Initial (0-indexed) LINKLIST:\n");
        lnklst.display();
        System.out.printf("After inserting node at starting.\n");
        lnklst.insertAtFirst(0);
        lnklst.display();
        System.out.printf("After inserting node at ending.\n");
        lnklst.insertAtLast(7);
        lnklst.display();
        System.out.printf("After inserting node at 4th position.\n");
        lnklst.insertAtIndex(4,-1);
        lnklst.display();
        System.out.printf("After removing the head.\n");
        lnklst.deleteHead();
        lnklst.display();
        System.out.printf("After removing the last node(tail).\n");
        lnklst.deleteLastNode();
        lnklst.display();
        System.out.printf("After removing 3rd node.\n");
        lnklst.deleteAtIndex(3);
        lnklst.display();
        System.out.printf("Searching element 5 in Linklist.\n");
        int pos=lnklst.searchElement(6);
        System.out.printf("Position of %d in linklist is :%d\n",6,pos);
    }
}

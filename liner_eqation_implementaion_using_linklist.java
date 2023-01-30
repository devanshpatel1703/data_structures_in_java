class linklist{
    static node head;
    static class node{
        int exponent;
        int data;
        node next;
        node(int data,int ex){
            this.exponent=ex;
            this.data=data;
            this.next=null;
        }
    }
    public static void insert(int data,int ex){
        node newnode=new node(data,ex);
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
            if(dummy.data>0){
                System.out.printf("+%dx^%d ",dummy.data,dummy.exponent);
            }
            else{
                System.out.printf("-%dx^%d ",dummy.data,dummy.exponent);
            }
            dummy=dummy.next;
        }
        System.out.printf(" = 0");
    }
    public static void main(String[] args){
        linklist lnklst=new linklist();
        lnklst.insert(1,0);
        lnklst.insert(2,1);
        lnklst.insert(3,2);
        lnklst.insert(4,3);
        lnklst.display();
    }
}

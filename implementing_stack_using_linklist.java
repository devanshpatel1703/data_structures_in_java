class stack{
    static node head;
    static class node{
        int data;
        node next;
        node(int n){
            this.data=n;
            this.next=null;
        }
    }
    public static void putIn(int a){
        node newnode=new node(a);
        if(head==null){
            head=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
    }
    public static void getOut(){
        if(head==null){
            System.out.printf("Stack is already empty.\n");
        }
        else{
            int a=head.data;
            System.out.printf("Getting out...\n");
            System.out.printf("%d\n",a);
            head=head.next;   
        }
    }
    public static void display(){
        node dummy=head;
        System.out.printf("CURRENT STACK : -->\n");
        while(dummy !=null){
            System.out.printf("    %d\n",dummy.data);
            dummy=dummy.next;
        }
        System.out.printf("\n");
    }
}
class Main{
    public static void main(String[] args) {
        stack stk=new stack();
        stk.putIn(1);
        stk.putIn(2);
        stk.putIn(3);
        stk.putIn(4);
        stk.putIn(5);
        stk.putIn(6);
        stk.display();
        stk.getOut();
        stk.display();
    }
}

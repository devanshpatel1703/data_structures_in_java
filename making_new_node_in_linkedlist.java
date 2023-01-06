class node{
    int data;
    node next;
    node(int data){
        this.data=data;
    }
}
class HelloWorld {
    public static void main(String [] args){
        node n=new node(1);
        node p=n;
        p.next=new node(2);
        System.out.println(p.next.data);
    }
}

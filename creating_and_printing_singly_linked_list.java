public class linklist{
    private listnode head;
    
    
    public static class listnode{
        private int data;
        private listnode next;
        
        
        public listnode(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    public void display(){
        listnode current=head;
        while(current!=null){
            System.out.print(current.data+" --> ");
            current=current.next;
        }
        System.out.print("null");
    }
    
    public static void main(String [] args){
        linklist sll=new linklist();
        sll.head=new listnode(1);
        listnode sec=new listnode(2);
        listnode thr=new listnode(3);
        listnode forth=new listnode(4);
        sll.head.next=sec;
        sec.next=thr;
        thr.next=forth;
        sll.display();
    }
}

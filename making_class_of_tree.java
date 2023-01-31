class binaryTree{
    static treenode root;
    static class treenode{
        treenode left=null;
        treenode right=null;
        int data;
        treenode(int data){
            this.data=data;
        }
    }
    public static void root(int n){
        treenode newnode=new treenode(n);
        root=newnode;
    }
    public static void insertAtLeft(int n){
        treenode newnode=new treenode(n);
        root.left=newnode;
    }
    public static void insertAtRight(int n){
        treenode newnode=new treenode(n);
        root.right=newnode;
    }
    public static void print(){
        System.out.printf("Root :%d\nRoot left :%d\nRoot right :%d",root.data,root.left.data,root.right.data);
    }
}
class Main{
    public static void main(String[] args) {
        binaryTree tree=new binaryTree();
        tree.root(1);
        tree.insertAtLeft(2);
        tree.insertAtRight(3);
        tree.print();
    }
}

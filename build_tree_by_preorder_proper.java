class binaryTree{
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
        }
    }
    static int idx=-1;
    public static node buildTreePreorder(int[] a){
        idx++;
        if(a[idx]==-1){
            return null;
        }
        node newnode = new node(a[idx]);
        newnode.left=buildTreePreorder(a);
        newnode.right=buildTreePreorder(a);
        return newnode;
    }
    public static void main(String[] args){
        int a[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree tree=new binaryTree();
        node root=buildTreePreorder(a);
        System.out.printf("%d",root.right.right.data);
    }
}

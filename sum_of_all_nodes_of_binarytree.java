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
    public static int sum(node root){
        if(root==null){
            return 0;
        }
        return root.data+sum(root.left)+sum(root.right);
    }
    public static void main(String[] args){
        int a[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree tree=new binaryTree();
        node root=buildTreePreorder(a);
        System.out.printf("Root :%d\n",root.data);
        System.out.printf("Sum :%d",tree.sum(root));
    }
}

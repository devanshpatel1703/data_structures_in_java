public class Main{
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class tree{
        static int idx=-1;
        public static node buildTree(int[] n){
            idx++;
            if(n[idx]==-1){
                return null;
            }
            node newnode=new node(n[idx]);
            newnode.left=buildTree(n);
            newnode.right=buildTree(n);
            return newnode;
        }
    }
    public static void inorderTraversal(node root){
        if(root==null){
            System.out.printf("-1 ");
            return;
        }
        inorderTraversal(root.left);
        System.out.printf("%d ",root.data);
        inorderTraversal(root.right);
    }
    public static void main(String[] args) {
		int[] n={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        tree t=new tree();
        node root=t.buildTree(n);
        System.out.printf("Root is :%d\n",root.data);
        inorderTraversal(root);
	}
}

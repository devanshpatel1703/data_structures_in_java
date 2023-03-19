import java.util.*;
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
    public static int countNodes(node root){
        if(root==null){
            return 0;
        }
        int left=countNodes(root.left);
        int right=countNodes(root.right);
        return left+right+1;
    }
    public static void main(String[] args) {
		int[] n={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        tree t=new tree();
        node root=t.buildTree(n);
        System.out.printf("Root is :%d\n",root.data);
        System.out.printf("Total nodes in binary tree :%d\n",countNodes(root));
	}
}

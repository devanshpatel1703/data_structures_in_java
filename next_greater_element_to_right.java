import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter the size of array :");
        int n=input.nextInt();
        int[] a=new int[n];
        int[] ans=new int[n];
        System.out.printf("Enter array :");
        for(int i=0;i<a.length;i++){
            a[i]=input.nextInt();
        }
        int in=a.length-1;
        Stack<Integer> stk=new Stack<>();
        for(int i=a.length-1;i>=0;i--){
            if(stk.isEmpty()){
                ans[in--]=-1;
            }
            else if(stk.peek()>a[i]){
                ans[in--]=stk.peek();
            }
            else{
                while(!stk.isEmpty() && stk.peek()<=a[i]){
                    stk.pop();
                }
            }
            stk.push(a[i]);
        }
        System.out.printf("Nearest greater right (array) :\n");
        for(int i: ans){
            System.out.printf("%d ",i);
        }
    }
}

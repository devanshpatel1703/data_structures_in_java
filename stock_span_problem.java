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
        for(int i=a.length-1;i>=0;i--){
            int count=0;
            for(int j=i;j>=0;j--){
                if(a[j]>a[i]){
                    break;
                }
                else{
                    count++;
                }
            }
            ans[i]=count;
        }
        for(int I : ans){
            System.out.printf("%d ",I);
        }
    }
}

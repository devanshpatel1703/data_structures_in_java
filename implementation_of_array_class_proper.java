import java.util.*;
class Array{
    int size;
    int[] a;
    int start=0;
    Array(int size){
        this.size=size;
        this.a=new int[size];
    }
    public void insert(int n){
        a[start++]=n;
    }
    public void print(){
        System.out.printf("Current Array -->    ");
        for(int i=0;i<a.length;i++){
            System.out.printf("%d ",a[i]);
        }
        System.out.printf("\n");
    }
    public int index(int check){
        for(int i=0;i<a.length;i++){
            if(a[i]==check){
                return (i);
            }
        }
        return (-1);
    }
}
class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter the size of array :");
        int n=input.nextInt();
        Array arr=new Array(n);
        System.out.printf("Enter the array elements seprated by space :\n");
        for(int i=0;i<n;i++){
            int a=input.nextInt();
            arr.insert(a);
        }
        arr.print();
        System.out.printf("Enter the element you want index :");
        int ele=input.nextInt();
        System.out.printf("The index of %d is %d\n",ele,arr.index(ele));
    }
}

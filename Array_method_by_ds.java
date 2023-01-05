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
        for(int i=0;i<size;i++){
            System.out.printf("%d ",a[i]);
        }
        System.out.printf("\n");
    }
    public void delete(int index){
        
    }
}
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Array arr=new Array(5);
        for(int i=0;i<5;i++){
            int a=input.nextInt();
            arr.insert(a);
        }
        arr.print();
    }
}

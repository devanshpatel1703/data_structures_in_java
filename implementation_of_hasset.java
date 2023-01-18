import java.util.*;
class hashset{
    ArrayList<Integer> lst=new ArrayList<>();
    public void insert(int a){
        if(!lst.contains(a)){
            lst.add(a);   
        }
    }
    public void display(){
        for(int i : lst){
            System.out.printf("%d ",i);
        }
        System.out.printf("\nCurrent size :%d",lst.size());
    }
}
class HelloWorld {
    public static void main(String[] args) {
        hashset set=new hashset();
        set.insert(1);
        set.insert(1);
        set.insert(2);
        set.insert(2);
        set.insert(3);
        set.insert(3);
        set.insert(4);
        set.display();
    }
}

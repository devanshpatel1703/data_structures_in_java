import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        String str="212+454-78*(23+45)";
        String ans="";
        String check="*+-()/";
        ArrayList<String> lst=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            if(check.indexOf(str.charAt(i))!=-1){
                String s="";
                s=s+str.charAt(i);
                lst.add(s);
                i++;
            }
            else{
                int j=i;
                String a="";
                while(check.indexOf(str.charAt(j))==-1){
                    a=a+str.charAt(j++);
                }
                lst.add(a);
                i=j;
            }
        }
        for(String an : lst){
            System.out.printf("%s\n",an);
        }
    }
}

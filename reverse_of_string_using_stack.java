import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.printf("Enter String to reverse it :");
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        Stack stk=new Stack();
        for(int i=0;i<str.length();i++){
            stk.push(str.charAt(i));
        }
        String ans="";
        while(!stk.isEmpty()){
            ans=ans+stk.pop();
        }
        System.out.printf("The reverse string is : %s",ans);
    }
}

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter the postfix equation to calculate :");
        String s=input.next();
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                int a=s.charAt(i)-'0';
                stk.push(a);
            }
            else if(s.charAt(i)=='+'){
                int a=stk.pop();
                int b=stk.pop();
                stk.push(b+a);
            }
            else if(s.charAt(i)=='-'){
                int a=stk.pop();
                int b=stk.pop();
                stk.push(b-a);
            }
            else if(s.charAt(i)=='/'){
                int a=stk.pop();
                int b=stk.pop();
                stk.push(b/a);
            }
            else if(s.charAt(i)=='*'){
                int a=stk.pop();
                int b=stk.pop();
                stk.push(b*a);
            }
        }
        System.out.printf("Answer :%d",stk.pop());
    }
}

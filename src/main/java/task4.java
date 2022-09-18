import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        LinkedList<String> stk = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            String str = scanner.nextLine();
            if(str.equalsIgnoreCase("print"))
            {
                for (String string : stk) {
                    System.out.print(string + " ");
                }
                System.out.println();
            }
            else if(str.equalsIgnoreCase("revert")){
                stk.pop();
            }
            else
                stk.push(str);
        }

        }

    public static void k(String[] args) {
        Deque<String> deque = new LinkedList<>();
        Scanner st = new Scanner(System.in);
        while (true){
            String text = st.nextLine();
            if (text.equalsIgnoreCase("print")){
                for (String a:deque)System.out.print(a +" ");
                System.out.println();
            }
            else if (text.equalsIgnoreCase("revert"))deque.removeFirst();
            else
                deque.addFirst(text);

    }
}}

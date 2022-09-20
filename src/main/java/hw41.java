import java.util.*;
public class hw41 {

        public static void main(String[] args) {
            Map<String,List<String>> TNum = new HashMap<>();
            Scanner sc = new Scanner(System.in);
            Scanner nm = new Scanner(System.in);
            while (true){
                System.out.println("1)добавить\n2)изменить\n3)показать все\n4)удалить");
                int choise = sc.nextInt();
                if (choise==1){
                    System.out.print("Введите Имя");
                    String name = nm.nextLine();
                    System.out.print("Введите номер телефона(через пробел если их несколько)");
                    String []PhoneNum = nm.nextLine().split(" ");
                    List<String>asd=Arrays.asList(PhoneNum);
                    TNum.putIfAbsent(name,asd);
                } else if (choise == 2) {
                    System.out.print("Введите Имя");
                    String name = nm.nextLine();
                    System.out.print("Введите Номер телефона(через пробел если их несколько)");
                    String []PhoneNum = nm.nextLine().split(" ");
                    List<String>asd=Arrays.asList(PhoneNum);
                    TNum.put(name,asd);
                } else if (choise == 3) {
                    System.out.println(TNum + "\n");
                } else if (choise == 4) {
                    System.out.print("Введите имя которое хотите удалить");
                    String name = nm.nextLine();
                    TNum.remove(name);
                }
            }
        }
    }


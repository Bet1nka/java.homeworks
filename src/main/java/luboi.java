import java.time.LocalDateTime;
import java.util.*;

public class luboi {
    public static void main(String[] args) {

        System.out.println("Привет,меня зовут java\nА тебя как зовут?");
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        LocalDateTime now = LocalDateTime.now();
        int x = now.getHour();
        String timeofday = null;

        if (x >= 5 && x < 12)  timeofday = "Доброе утро";
        else if (x >= 12 && x < 18) timeofday = "Добрый день";
        else if(x >= 18 && x < 23)  timeofday = "Добрый вечер";
        else if (x >= 23 && x < 5)  timeofday = "Доброй ночи"  ;

        System.out.println(timeofday + ", " + name + ", рада нашему знакомству!");

    }
}

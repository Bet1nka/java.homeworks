import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
public class task3 {
    public static void main(String[] args) {


        // марс земля юпитер венера нептун уран меркурий
        String[] suni = {"марс", "земля", "юпитер", "венера", "нептун", "уран", "меркурий"};
        ArrayList<String> sun = fillArray(10, suni);
        System.out.println(sun);
        sun.sort(Comparator.naturalOrder());
        kolvo(sun);
        System.out.println(deleteLIfe(sun));


    }

    static ArrayList<String> fillArray(int lenght, String[] arr) {
        ArrayList<String> sun = new ArrayList<String>();
        Random a = new Random();
        for (int i = 0; i < lenght; i++) {
            int random = a.nextInt(7 - 0) + 0;
            sun.add(arr[random]);
        }
        return sun;
    }

    static void kolvo(ArrayList<String> saa) {
        int count = 0;
        for (int i = 0; i < saa.size() - 1; i++) {
            count++;
            if (saa.get(i) != saa.get(i + 1)) {
                System.out.printf(saa.get(i) + " - " + count + "\n");
                count = 0;
            }
        }
        System.out.printf(saa.get(saa.size() - 1) + " - " + (count + 1) + "\n");
    }

    static ArrayList<String> deleteLIfe(ArrayList<String> popi) {
        int i = 0;
        while (i < popi.size() - 1) {
            if (popi.get(i) == popi.get(i + 1)) popi.remove(i + 1);
            else i++;}
            return popi;
        }

    }




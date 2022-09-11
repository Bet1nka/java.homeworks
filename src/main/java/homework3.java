import java.util.*;

public class homework3 {
    public static void main(String[] args) {
        //1. Пусть дан произвольный список целых чисел, удалить из него четные числа
        //2. Задан целочисленный список ArrayList.Найти минимальное, максимальное и среднее из этого списка
        ArrayList<Integer> numlist = fillArray(7);
        System.out.println(numlist);
        System.out.println("список из нечетных" + isOdd(numlist));

        numlist.sort(Comparator.naturalOrder());
        int max = numlist.get(numlist.size()-1);
        int min = numlist.get(0);
        int mid = numlist.get(numlist.size()/2);
        System.out.println("Среднее - " + mid+" Среднее арифмитическое - "+ middle(numlist)+" Минимальное - " +min+" Масимальнное - "+max);
    }

    static ArrayList<Integer> fillArray(int lenght) {
        ArrayList<Integer> ArrNum = new ArrayList<Integer>();
        Random a = new Random();
        for (int i = 0; i < lenght; i++) {
            int random = a.nextInt(30 - 1) + 1;
            ArrNum.add(random);
        }
        return ArrNum;
    }

    public static ArrayList<Integer> isOdd(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
                i--;
            }
        }
        return numbers;
        }
    public static int middle (ArrayList<Integer> numbers){
        int sum =0;
        for(int i: numbers){
             sum +=i;
        }
        int midx = sum/ numbers.size();
        return midx;
    }

}


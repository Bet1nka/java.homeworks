import java.util.*;
public class hw4 {
        public static void main(String[] args) {
            LinkedList<String> name = new LinkedList<>();
            Map<Integer, String> countNames = new TreeMap<>();
            Map<String, String> ad = Map.of("Петрова", "Василиса",
                    "Чернышов", "Петр",
                    "Белова", "Василиса",
                    "Лыков", "Олег",
                    "Веселов", "Иван",
                    "Кююгер", "Олег",
                    "Крюгеров", "Олег");
            for (Map.Entry<String, String> entry : ad.entrySet()) {
                name.add(entry.getValue());
                System.out.println(name);
                name.sort(Comparator.naturalOrder());
            }
            for (String Names : name) {
                if (!countNames.containsValue(Names)) {
                    int count = Collections.frequency(name, Names);
                    countNames.put(count, Names);
                }
            }
            System.out.println(countNames);
            System.out.println(((TreeMap<Integer, String>) countNames).descendingMap());
        }

    }




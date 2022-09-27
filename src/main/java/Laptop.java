import java.util.*;
 public class Laptop implements Comparable <Laptop> {

        private int id;
        private int ram;
        private int sizeHD;
        private String OS;
        private  String color;
        private int price;
        private String model;

        public Laptop(int id, int ram, int sizeHD, String OS, String color, int price, String model) {
            this.id = id;
            this.ram = ram;
            this.sizeHD = sizeHD;
            this.OS = OS;
            this.color = color;
            this.price = price;
            this.model = model;
        }

        public Laptop(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getRam() {
            return ram;
        }

        public void setRam(int ram) {
            this.ram = ram;
        }

        public int getSizeHD() {
            return sizeHD;
        }

        public void setSizeHD(int sizeHD) {
            this.sizeHD = sizeHD;
        }

        public String getOS() {
            return OS;
        }

        public void setOS(String OS) {
            this.OS = OS;
        }
        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Laptop laptop = (Laptop) o;
            return id == laptop.id && ram == laptop.ram && sizeHD == laptop.sizeHD && price == laptop.price && Objects.equals(OS, laptop.OS) && Objects.equals(color, laptop.color) && Objects.equals(model, laptop.model);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, ram, sizeHD, OS, color, price, model);
        }


        @Override
        public String toString() {
            return "Laptop{" +
                    "id=" + id +
                    ", ram=" + ram +
                    ", sizeHD=" + sizeHD +
                    ", OS='" + OS + '\'' +
                    ", color='" + color + '\'' +
                    ", price=" + price +
                    ", model='" + model + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Laptop o) {
            return Integer.compare(this.id,o.id);
        }

        public static void main(String[] args) {
            Set<Laptop> store = new TreeSet<>();
            store.add(new Laptop(2,16000,1000,"linux","white",89000,"lenovo"));
            store.add(new Laptop(3,8000,500,"windows","black",58000,"msi"));
            store.add(new Laptop(1,16000,500,"windows"," white",88999,"asus"));
            store.add(new Laptop(4,4000,500,"macOS","blue",87000,"apple"));
            store.add(new Laptop(5,4000,500,"macOS","gray",87000,"apple"));

            for (Laptop n:store) {
                System.out.println(n);
            }
            System.out.println("""
                Введите цифру, соответствующую необходимому критерию:
                1)ram
                2)sizeHD
                3)OS
                4)color
                5)price
                6)model""");
            Scanner sc = new Scanner(System.in);
            Scanner st = new Scanner(System.in);
            int choice = sc.nextInt();
            if (choice == 1){
                System.out.println("введите критерия поиска для чисел(минимальное значение)");
                int min = sc.nextInt();
                System.out.println("введите критерия поиска для чисел(максимальное значение)");
                int max = sc.nextInt();
                for (Laptop a:store) {
                    if(a.ram > min && a.ram<max)
                        System.out.println(a);
                }
            }
            if (choice == 2) {
                System.out.println("введите критерия поиска для чисел(минимальное значение)");
                int min = sc.nextInt();
                System.out.println("введите критерия поиска для чисел(максимальное значение)");
                int max = sc.nextInt();
                for (Laptop a : store) {
                    if (a.sizeHD > min && a.sizeHD < max)
                        System.out.println(a);
                }
            }
            if (choice == 3) {
                System.out.println("введите критерия поиска для чисел(операционную систему)");
                String OSFInd = st.nextLine();
                for (Laptop a : store) {
                    if (a.OS.equals(OSFInd))
                        System.out.println(a);
                }
            }
            if (choice == 4) {
                System.out.println("введите критерия поиска для чисел(color)");
                String ColorFind = st.nextLine();
                for (Laptop a : store) {
                    if (a.color.equals(ColorFind))
                        System.out.println(a);
                }
            }
            if (choice == 5) {
                System.out.println("введите критерия поиска для чисел(минимальное значение)");
                int min = sc.nextInt();
                System.out.println("введите критерия поиска для чисел(максимальное значение)");
                int max = sc.nextInt();
                for (Laptop a : store) {
                    if (a.price > min && a.price < max)
                        System.out.println(a);
                }
            }
            if (choice == 6) {
                System.out.println("введите критерия поиска для чисел(модель)");
                String ModelFInd = st.nextLine();
                for (Laptop a : store) {
                    if (a.OS.equals(ModelFInd))
                        System.out.println(a);
                }

            }

        }

}

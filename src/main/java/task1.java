public class task1 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1};
        int result = findmax(arr);
        System.out.printf("max length = "+ result);



        int[] arr1 = new int[]{2, 2, 0, 1, 1, 1, 1, 1,1};
        int max1 = 1;
        int current_max = 1;
        for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i] == arr1[i + 1]) {
                current_max = current_max + 1;
                max1 = current_max;
            } else {
                current_max = 1;
            }

        }
        System.out.println(max1);

    }


    public static int findmax(int[] array) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count += 1;
                if (count > max) max = count;
            } else {
                count = 0;
            }
        }
        return max;
    }
}

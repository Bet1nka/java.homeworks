public class homework1 {
    public static void main(String[] args) {
        int[] arr = new int [] {2,7,4,6,3,5,5};
        int sum1 = 0;
        for (int i = 0; i < arr.length/2; i++) {
            sum1 += arr[i];
            int sum2 = 0;
            for (int j = arr.length-1; j >= 0 ; j--) {
                sum2 += arr[j];
                if ( sum1 == sum2){
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}

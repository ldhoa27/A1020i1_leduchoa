package sort_algorithm.thuchanh.cai_dat;

public class bubbleSort {
    static int[] arr = {2, 5, 4, 9, 3, -1, 8};
    public static void bubbleSort(int[] arr){
        boolean needNextPass = true;
        for(int k= 1; k < arr.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < arr.length - k; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    needNextPass = true; /* Next pass still needed */
                }
            }
        }
    }
    public static void main(String[] args) {
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

}

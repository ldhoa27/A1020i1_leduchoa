package OOP.baitap.lop_stop_watch;

public class Main {
    public static void swap(double num1, double num2) {
        double temp = num1;
        num1 = num2;
        num2 = temp;
    }
    public static void selectionSort(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length -i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    swap(arr[j], arr[j + 1]);
                }
            }
        }
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        double[] arr = new double[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * 100000;
        }
        stopWatch.start();
        selectionSort(arr);
        stopWatch.end();
        System.out.println("Thoi gian thuat toan chay: " + stopWatch.getElapsedTime());
    }
}

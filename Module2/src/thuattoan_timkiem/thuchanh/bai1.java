package thuattoan_timkiem.thuchanh;

public class bai1 {
    static int[] list = {1, 5, 13, 7, 11, 20};
    static int binarySearch(int[] list, int numberNeed){
        int low = 0;
        int high = list.length-1;
        while(high >= low){
            int mid = (low+high)/2;
            if(numberNeed < list[mid]){
                high = mid -1;
            } else if(numberNeed == list[mid]){
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}

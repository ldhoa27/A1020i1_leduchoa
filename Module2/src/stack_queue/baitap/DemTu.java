package stack_queue.baitap;

import java.util.*;

public class DemTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = scanner.nextLine();
        s = s.toLowerCase();
        List<String> arr = new ArrayList<>();
        for(int i =0; i < s.length(); i++){
                arr.add(String.valueOf(s.charAt(i)));
        }
        Map<String, Integer> map = new TreeMap<>();
        for(String x:arr){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }else {
                map.put(x,1);
            }
        }
            System.out.print(map);

    }
}

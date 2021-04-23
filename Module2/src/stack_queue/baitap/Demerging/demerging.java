package stack_queue.baitap.Demerging;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.Queue;

public class demerging {
    public static void main(String[] args) throws ParseException {
        Employee[] employees = {
                new Employee(1, new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2021")),
                new Employee(0, new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2031")),

        };
        Queue<Employee> queue = new LinkedList<>();
        Queue<Employee> queue1 = new LinkedList<>();
        for(Employee e : employees){
            if(e.getGender() == 0){
                queue.offer(e);
            } else {
                queue1.offer(e);
            }
        }
        int employeeIndex = 0;
        while (!queue.isEmpty()){
            employees[employeeIndex++] = queue.poll();
        }
        while (!queue1.isEmpty()){
            employees[employeeIndex++] = queue1.poll();
        }
        System.out.println("result: ");
        for(Employee e : employees){
            System.out.println(e.toString());
        }

    }
}

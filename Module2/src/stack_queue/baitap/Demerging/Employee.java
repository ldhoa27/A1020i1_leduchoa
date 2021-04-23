package stack_queue.baitap.Demerging;

import java.util.Date;

public class Employee {
    private int gender;
    private Date dateOfBirthday;
    public Employee(int gender, Date dateOfBirthday){
        this.gender = gender;
        this.dateOfBirthday = dateOfBirthday;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Date getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(Date dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "gender=" + gender +
                ", dateOfBirthday=" + dateOfBirthday +
                '}';
    }
}

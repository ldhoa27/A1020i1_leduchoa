package case_study_.Exception;

import org.omg.CORBA.UserException;

import java.time.LocalDate;
import java.time.Period;

public class BirthdayException extends UserException {
    public BirthdayException(String message) {
        super(message);
    }

    public static boolean checkBirthday(String birthdayCheck) {
        String regex = "^[\\d]{2}/[\\d]{2}/[\\d]{4}$";
        boolean check = birthdayCheck.matches(regex);
        try {
            if (check) {
                int day = Integer.parseInt(birthdayCheck.substring(0, 2));
                int month = Integer.parseInt(birthdayCheck.substring(3, 5));
                int year = Integer.parseInt(birthdayCheck.substring(6, 10));
                LocalDate today = LocalDate.now();
                LocalDate birthday = null;
                try {
                    birthday = LocalDate.of(year, month, day);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }

                if (year <= 1900) {
                    throw new BirthdayException("lỗi, phải lớn hơn 1900");
                }
                if (Period.between(birthday, today).getYears() < 18) {
                    throw new BirthdayException("không đủ tuổi");
                }
            }
        } catch (BirthdayException ex) {
            System.out.println(ex.getMessage());
            check = false;
        }
        return check;
    }
}

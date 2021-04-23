package case_study_.Exception;

import org.omg.CORBA.UserException;

public class PhoneNumberException extends UserException {
    public PhoneNumberException(String message) {
        super(message);
    }

    public static boolean checkPhoneNumber(String number) {
        String regex = "^[0-9]+$";
        boolean check = number.matches(regex);
        try {
            if (!check) {
                throw new PhoneNumberException("Lỗi, hãy nhập lại!!");
            }
        } catch (PhoneNumberException ex) {
            System.out.println(ex.getMessage());
        }
        return check;
    }
}
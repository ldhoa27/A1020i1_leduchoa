package case_study_.Exception;

import org.omg.CORBA.UserException;

public class EmailException extends UserException {
    public EmailException(String message) {
        super(message);
    }

    public static boolean checkEmail(String email) {
        String regex = "^[a-zA-Z][\\w]+@([\\w]+\\.[\\w]{2,})$";
        boolean check = email.matches(regex);
        try {
            if (!check) {
                throw new EmailException("Lỗi, hãy nhập lại!!");
            }
        } catch (EmailException ex) {
            System.out.println(ex.getMessage());
        }
        return check;
    }
}
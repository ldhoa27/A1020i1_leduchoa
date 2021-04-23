package case_study_.Exception;

import org.omg.CORBA.UserException;

public class GenderException extends UserException {
    public GenderException(String message) {
        super(message);
    }

    public static boolean checkGender(String gender) {
        String regex = "(Male)|(Female)|(Unknown)";
        boolean check = gender.matches(regex);
        try {
            if (!check) {
                throw new GenderException("Lỗi, hãy nhập lại(Male, Female, Unknown)");
            }
        } catch (GenderException ex) {
            System.out.println(ex.getMessage());
        }
        return check;
    }
}
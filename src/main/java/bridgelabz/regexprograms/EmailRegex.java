package bridgelabz.regexprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegex {
    private static final String EMAIL_PATTERN = "^[a-z]{3}\\.?[a-z]*@[a-z]{10}.*$";

    public static boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String emailToValidate = "abc.xyz@bridgelabz.co.in";

        if (validateEmail(emailToValidate)) {
            System.out.println(emailToValidate + " has a valid start with abc and bridgelabz .");
        } else {
            System.out.println(emailToValidate + " does not have a valid start (abc).");
        }
    }
}

package bridgelabz.regexprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegex {
    private static final String EMAIL_PATTERN = "^[a-z]{3}([_+\\-.][a-z]+)?@[a-z]{10}\\.[a-z]{2}.*$";

    public static boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String emailToValidate2 = "abc.xyz@bridgelabz.co.in";
        String emailToValidate1 = "abc.v@bridgelabz.co.in";
        String emailToValidate3 = "abc+xyz@bridgelabz.co.in";
        String emailToValidate4 = "abc-xyz@bridgelabz.co.in";
        String emailToValidate5 = "abc#xyz@bridgelabz.co.in";

        System.out.println(emailToValidate1 + ": " + (validateEmail(emailToValidate1) ? "Valid" : "Invalid"));
        System.out.println(emailToValidate2 + ": " + (validateEmail(emailToValidate2) ? "Valid" : "Invalid"));
        System.out.println(emailToValidate3 + ": " + (validateEmail(emailToValidate3) ? "Valid" : "Invalid"));
        System.out.println(emailToValidate4 + ": " + (validateEmail(emailToValidate4) ? "Valid" : "Invalid"));
        System.out.println(emailToValidate5 + ": " + (validateEmail(emailToValidate5) ? "Valid" : "Invalid"));
    }
}

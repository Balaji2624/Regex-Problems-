package bridgelabz.regexprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegex {
    private static final String EMAIL_PATTERN = "^[a-z]{3}([_+\\-.][a-z]+)?@[a-z]{10}\\.[a-z]{2}.(\\.[a-z]{2})?$";

    public static boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String emailToValidate1 = "abc@bridgelabz.co.in";      // Valid, with optional country code
        String emailToValidate2 = "abc.xyz@bridgelabz.co";     // Valid, without country code
        String emailToValidate3 = "abc.xyz@bridgelabz.co.uk";  // Valid, with optional country code
        String emailToValidate4 = "abc.xyz@bridgelabz";

        System.out.println(emailToValidate1 + ": " + (validateEmail(emailToValidate1) ? "Valid" : "Invalid"));
        System.out.println(emailToValidate2 + ": " + (validateEmail(emailToValidate2) ? "Valid" : "Invalid"));
        System.out.println(emailToValidate3 + ": " + (validateEmail(emailToValidate3) ? "Valid" : "Invalid"));
        System.out.println(emailToValidate4 + ": " + (validateEmail(emailToValidate4) ? "Valid" : "Invalid"));
    
    }
}

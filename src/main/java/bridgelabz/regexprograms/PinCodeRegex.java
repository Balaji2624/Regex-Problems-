package bridgelabz.regexprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCodeRegex {
    private static final String PINCODE_PATTERN = "^[1-9][0-9]{5}$";
    public static boolean validatePinCode(String pincode){
        if (!Character.isDigit(pincode.charAt(0))) {
            return false;
        }
        if (!Character.isDigit(pincode.charAt(pincode.length() - 1))) {
            return false;
        }
        Pattern pattern = Pattern.compile(PINCODE_PATTERN);
        Matcher matcher = pattern.matcher(pincode);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String pincodeToValidate = "400088B";

        if(validatePinCode(pincodeToValidate)){
            System.out.println(pincodeToValidate+ " is valid pincode.");
        }else{
            System.out.println("Invalid Pincode..!");
        }
    }

}

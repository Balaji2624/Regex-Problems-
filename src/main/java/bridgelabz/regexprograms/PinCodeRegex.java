package bridgelabz.regexprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCodeRegex {
    private static final String PINCODE_PATTERN = "^[1-9][0-9]{2}\\s?[0-9]{3}$";
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
        String pincodeToValidate1 = "400088";
        String pincodeToValidate2 = "400 088";
        if(validatePinCode(pincodeToValidate1)){
            System.out.println(pincodeToValidate1+ " is valid pincode.");
        }else{
            System.out.println("Invalid Pincode..!");
        }

        if (validatePinCode(pincodeToValidate2)) {
            System.out.println(pincodeToValidate2 + " is a valid pincode.");
        } else {
            System.out.println("Invalid Pincode..!");
        }
    }

}

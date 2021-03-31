package com.switchfully.util;

import java.util.regex.Pattern;

public class PhoneValidator {


    private static final Pattern VALID_PHONE_REGEX = Pattern.compile("^(?:(?:\\+|00)32[\\s.-]{0,3}(?:\\(0\\)[\\s.-]{0,3})?|0)[1-9](?:(?:[\\s.-]?\\d{2}){4}|\\d{2}(?:[\\s.-]?\\d{3}){2})$", Pattern.CASE_INSENSITIVE);





    public static boolean isValidPhoneNumber(String email){
        return VALID_PHONE_REGEX.matcher(email).matches();
    }

}

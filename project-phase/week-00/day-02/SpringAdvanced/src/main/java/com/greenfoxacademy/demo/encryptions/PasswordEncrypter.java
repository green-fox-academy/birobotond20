package com.greenfoxacademy.demo.encryptions;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.security.SecureRandom;

public class PasswordEncrypter {

    private static byte[] generateSaltString() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] salt = new byte[8];
        // generates a user-specified number of random bytes and places them into a user-supplied byte array.
        secureRandom.nextBytes(salt);
        return salt;
    }

    public static String encryptPassword(String password) {
        BASE64Encoder base64Encoder = new BASE64Encoder();
        return base64Encoder.encode(generateSaltString()) + base64Encoder.encode(password.getBytes());
    }

    public static String decryptPassword(String encryptedString){

        if (encryptedString.length() > 12){
            String encryptedPassword = encryptedString.substring(12);
            BASE64Decoder base64Decoder = new BASE64Decoder();

            try {
                return new String(base64Decoder.decodeBuffer(encryptedPassword));
            } catch (IOException ex){
                return "";
            }
        }
        return "";
    }
}

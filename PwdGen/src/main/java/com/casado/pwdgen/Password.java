package com.casado.pwdgen;

import java.security.SecureRandom;

public class Password {
    public static String generateRandomPassword(int len, String finalCharset)
    {
        
 
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
  
        for (int i = 0; i < len; i++)
        {
            int randomIndex = random.nextInt(finalCharset.length());
            sb.append(finalCharset.charAt(randomIndex));
        }
 
        return sb.toString();
    }
    
    public static String setCharset(boolean special, boolean numbers, boolean upper, boolean lower){
        final String charsUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String charsLower = "abcdefghijklmnopqrstuvwxyz";
        final String charsSpecial = "!#$%&*+-/:;<>=?@";
        final String charsNumbers = "0123456789";
        
        String finalCharset = "";
        
        if (special){
            finalCharset += charsSpecial;
        }
        
        if (numbers){
            finalCharset += charsNumbers;
        }
        
        if (upper){
            finalCharset += charsUpper;
        }
        
        if (lower){
            finalCharset += charsLower;
        }
        
        return finalCharset;
    }
 
    
}

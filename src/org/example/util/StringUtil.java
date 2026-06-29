package org.example.util;
public class StringUtil  {
    public static  String ReverseString (String str) {
        if (str == null || str.isEmpty()) {
        return "";
    }

        char[] chars = str.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (!Character.isLetter(chars[start])) {
                start++; // if not a letter just move fwd
            }
            else if (!Character.isLetter(chars[end])) {
                end--;
            }
            // do the swap
            else {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;

                // move both pointers towards center after swap
                start++;
                end--;
            }

        }
        return new String(chars);
    }

}
package org.example.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class StringUtilTest {
    @Test
    void testReverseString() {
        // setting up vars and classes
        StringUtil srtUtil = new StringUtil();
        String input = "1B@ng!";

        // invoke the target method
        String actualResult = srtUtil.ReverseString(input);

        assertEquals("1g@nB!", actualResult, "Only the letteres will be reversed");
    }

     @Test
    void testReverseStringWithNullInput() {
        assertEquals("", StringUtil.ReverseString(null), "Null input should return an empty string!");
    }

    @Test
    void testReverseStringWithEmptyInput() {
        assertEquals("", StringUtil.ReverseString(""), "Empty input should return an empty string!");
    }
}
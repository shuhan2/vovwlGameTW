package com.tw;

import com.tw.practice.StringReader;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Field;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
public class StringReaderTest {

    private com.tw.practice.StringReader reader = new com.tw.practice.StringReader();

    private void setInputStream(String input) throws NoSuchFieldException, IllegalAccessException {
        Field scannerField = reader.getClass().getDeclaredField("scanner");
        scannerField.setAccessible(true);
        Scanner scannerWithMockedStream = new Scanner(new ByteArrayInputStream(input.getBytes()));
        scannerField.set(reader, scannerWithMockedStream);
    }

    @Test
    public void shouldReadString() throws Exception {

        setInputStream("abcd");
        assertEquals("abcd", reader.read());
    }

    @Test(expected = Exception.class)
    public void shouldThrowExceptionForNonNumberInput() throws Exception {
        setInputStream("123d");
        reader.read();
    }

}

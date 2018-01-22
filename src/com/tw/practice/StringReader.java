package com.tw.practice;
import org.apache.commons.lang3.StringUtils;
import java.lang.String;
import java.util.Scanner;
public class StringReader {
    private Scanner scanner = new Scanner(System.in);

    public String read() throws Exception {
        String input=scanner.next();
        if (StringUtils.isAlpha(input)) {
            return input;
        }
        throw new Exception("Invalid Input");
    }
}

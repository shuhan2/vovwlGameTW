package com.tw.practice;

import java.lang.String;
public class Game {
    private Printer printer;
    private StringReplace string =new StringReplace();
    private StringReader reader;
    public Game(Printer printer, StringReader reader) {
        this.printer = printer;
        this.reader = reader;
        //this.string = new String(numberGenerator.generate());
    }
    public void start() {
        try {
            printer.print("please input a string(letter):");
            String result = string.Replace(reader.read());
            printer.print(result);

       }catch (Exception e){
            printer.print(e.toString());
        }
    }

}

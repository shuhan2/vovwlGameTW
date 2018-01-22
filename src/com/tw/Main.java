package com.tw;
import com.tw.practice.Game;

import com.tw.practice.StringReader;
import com.tw.practice.Printer;
public class Main {
    public static void main(String[] args){
        game.start();
    }
    static Game game = new Game(new Printer(), new StringReader());

}

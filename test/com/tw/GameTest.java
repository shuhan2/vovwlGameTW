package com.tw;

import com.tw.practice.Game;
import com.tw.practice.StringReader;
import com.tw.practice.Printer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GameTest{
    @Mock
    private Printer mockedPrinter;

    @Mock
    private StringReader mockedReader;

    @Test
    public void shouldReturnSameString() throws Exception {

        Mockito.when(mockedReader.read()).thenReturn("hmm");

        Game game = new Game( mockedPrinter, mockedReader);

        game.start();
        Mockito.verify(mockedPrinter, Mockito.times(1)).print("please input a string(letter):");
        Mockito.verify(mockedPrinter, Mockito.times(1)).print("hmm");
    }

    @Test
    public void shouldReturnReplaceOneSingleString() throws Exception {

        Mockito.when(mockedReader.read()).thenReturn("ahe");

        Game game = new Game( mockedPrinter, mockedReader);

        game.start();
        Mockito.verify(mockedPrinter, Mockito.times(1)).print("please input a string(letter):");
        Mockito.verify(mockedPrinter, Mockito.times(1)).print("mommyhmommy");
    }

    @Test
    public void shouldReturnReplaceMoreThanOneString() throws Exception {

        Mockito.when(mockedReader.read()).thenReturn("hear");

        Game game = new Game( mockedPrinter, mockedReader);

        game.start();
        Mockito.verify(mockedPrinter, Mockito.times(1)).print("please input a string(letter):");
        Mockito.verify(mockedPrinter, Mockito.times(1)).print("hmommyr");
    }

    @Test
    public void shouldReturnOneMommy() throws Exception {

        Mockito.when(mockedReader.read()).thenReturn("a");

        Game game = new Game( mockedPrinter, mockedReader);

        game.start();
        Mockito.verify(mockedPrinter, Mockito.times(1)).print("please input a string(letter):");
        Mockito.verify(mockedPrinter, Mockito.times(1)).print("mommy");
    }
}
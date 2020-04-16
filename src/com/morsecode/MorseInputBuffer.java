package com.morsecode;

import java.util.Scanner;

public class MorseInputBuffer extends InputBuffer{

    private String previousLine=null;
    private String currentLine=null;

    public MorseInputBuffer(String inputFile){
        super(inputFile);

    }

    public MsgChar getChar(){
        previousLine=currentLine;
        Scanner reader = super.getReader();
        currentLine= String.valueOf(reader.next());
        MsgChar temp = new MsgChar(currentLine);
        return temp;
    }

    public boolean isEndOfWord(){
        if (previousLine.equals("\n") && !currentLine.equals("\n")) {
            return true;
        }
        else return false;

    }

    public boolean isEndOfSentence (){
        if (previousLine.equals("\n") && currentLine.equals("\n")) {
            return true;
        }
        else {
            return false;
        }
    }
}

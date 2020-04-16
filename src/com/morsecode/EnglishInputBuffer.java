package com.morsecode;
import java.util.*;

public class EnglishInputBuffer extends InputBuffer{

    private String currentToken=null;
    private int currentPosition=0;

    public EnglishInputBuffer(String inputFile){
        super(inputFile);
    }

    //overridden
    public MsgChar getChar(){
        Scanner reader = super.getReader();
        String content = reader.useDelimiter("\\Z").next();
        currentToken= String.valueOf(content.charAt(currentPosition));
        currentPosition++;
        MsgChar temp = new MsgChar(currentToken);
        return temp;
    }

    public boolean isEndOfWord() {
        if (currentToken.equals(" ")) {
            return true;
        }
        else return false;
    }

    public boolean isEndOfSentence(){
        if (currentToken.equals("\n")) {
            return true;
        }
        else return false;
    }

}

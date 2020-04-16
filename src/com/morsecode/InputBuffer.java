package com.morsecode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class InputBuffer {

    private Scanner sc;

    public InputBuffer(String inputFile){
        File file = new File(inputFile);
        try {
            sc = new Scanner(file);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public boolean endOFBuffer(){
        return sc.hasNextLine();
    }

    public Scanner getReader(){
        return sc;
    }

    public void close(){
        sc.close();
    }

    //to be overridden
    public MsgChar getChar(){
        sc.useDelimiter(""); //to get only single token through next()
        String c= sc.next();
        MsgChar temp = new MsgChar(c);
        return temp;
    }

    //to be overridden
    public  boolean isEndOfWord(){return true;};

    //to be overridden
    public  boolean isEndOfSentence(){return true;};
}

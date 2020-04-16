package com.morsecode;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;
import java.io.UnsupportedEncodingException;

public class OutputBuffer {

    //member variables
    private PrintWriter writer = null;

    //parametrised constructor
    public OutputBuffer(String outputFile){
        File file = new File(outputFile);
        try {
            writer = new PrintWriter(file,"UTF-8");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } finally
        {
            if ( writer != null )
            {
                close();
            }
        }
    }

    public PrintWriter getWriter(){
        return writer;
    }

    public void close(){
        writer.close();
    }

    public void putChr(String charToWrite){
        writer.print(charToWrite);
    }

    //to be overridden
    public void markEndOfWord(){};

    //to be overridden
    public void markEndOfSentence(){};
}

package com.morsecode;

import java.io.PrintWriter;

public class MorseOutputBuffer extends OutputBuffer {

    public MorseOutputBuffer(String outputFile){
        super(outputFile);
    }

    public void  putChar(String charToWrite){
        PrintWriter writer;
        writer=super.getWriter();
        writer.print(charToWrite);
        writer.flush();
    }

    public void markEndOfWord(){
        PrintWriter writer;
        writer=super.getWriter();
        writer.print("\n");
        writer.flush();
    }

    public void markEndOFSentence(){
        PrintWriter writer;
        writer=super.getWriter();
        writer.println("\n");
        writer.flush();
    }


}

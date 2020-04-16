package com.morsecode;

import java.io.PrintWriter;

public class EnglishOutputBuffer extends OutputBuffer{

    public EnglishOutputBuffer(String outputFile){
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
        writer.print(" ");
        writer.flush();
    }

    public void markEndOFSentence(){
        PrintWriter writer;
        writer=super.getWriter();
        writer.println("/n");
        writer.flush();
    }


}

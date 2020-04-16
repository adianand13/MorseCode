package com.morsecode;

public class Translator {

    private boolean toMorse;

    private InputBuffer input;
    private OutputBuffer output;

    public Translator(String inputFile){
        if( inputFile.endsWith(".eng")){
            input = new EnglishInputBuffer(inputFile);
            String outputFile = inputFile.substring(0, inputFile.lastIndexOf('.')).concat(".mor");
            output = new MorseOutputBuffer(inputFile);
            toMorse = false;
            translate();
        }
        else if (inputFile.endsWith(".mor")){
            String outputFile = inputFile.substring(0, inputFile.lastIndexOf('.')).concat(".mor");
            input = new MorseInputBuffer(inputFile);
            output = new EnglishOutputBuffer(outputFile);
            toMorse = true;
            translate();
        }
        else{
            System.out.println("Invalid Input");
        }

    }

    void translate(){
        MsgChar token;
        if (toMorse){
            System.out.println("Converting Morse to English");
            while(input.endOFBuffer()){
                token = input.getChar();
                if (input.isEndOfWord()){
                    output.markEndOfWord();
                    continue;
                }
                if (input.isEndOfSentence()){
                    output.markEndOfSentence();
                    continue;
                }

                output.putChr(token.convert());
            }
        }
        else{
            System.out.println("Converting English to morse");
            while(input.endOFBuffer()){
                token = input.getChar();
                if (input.isEndOfWord()){
                    output.markEndOfWord();
                    continue;
                }
                if (input.isEndOfSentence()){
                    output.markEndOfSentence();
                    continue;
                }

                output.putChr(token.convert());
            }
        }
        System.out.println("Success");
    }
}

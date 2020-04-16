package com.morsecode;

public class MsgChar {

    private String charValue;

    public MsgChar(String charV){
        charValue=charV;
    }

    public String getChar(){
        return charValue;
    }

    public String convert(){
        String temp = null;
        if(charValue.length()==1){
            if (charValue.equals("\n"))
                temp = "\n";
            else if(charValue.equals(" "))
                temp = " ";
            else if(charValue.equals(","))
                temp = "--..--";
            else if(charValue.equals("?"))
                temp = "..--..";
            else if(charValue.equals("-"))
                temp = "-....-";
            else if(charValue.equals("."))
                temp = ".-.-.-";
            else if(charValue.equals("'"))
                temp = ".----.";
            else{
                switch(charValue)
                {
                    case "a" : temp =".-"; 		break;
                    case "b" : temp ="-..."; 	break;
                    case "c" : temp ="-.-."; 	break;
                    case "d" : temp ="-.."; 	break;
                    case "e" : temp ="."; 		break;
                    case "f" : temp ="..-."; 	break;
                    case "g" : temp ="--."; 	break;
                    case "h" : temp ="....";	break;
                    case "i" : temp =".."; 		break;
                    case "j" : temp =".---"; 	break;
                    case "k" : temp ="-.-"; 	break;
                    case "l" : temp =".-.."; 	break;
                    case "m" : temp ="--"; 		break;
                    case "n" : temp ="-."; 		break;
                    case "o" : temp ="---"; 	break;
                    case "p" : temp =".--."; 	break;
                    case "q" : temp ="--.-"; 	break;
                    case "r" : temp =".-."; 	break;
                    case "s" : temp ="..."; 	break;
                    case "t" : temp ="-"; 		break;
                    case "u" : temp ="..-"; 	break;
                    case "v" : temp ="...-"; 	break;
                    case "w" : temp =".--"; 	break;
                    case "x" : temp ="-..-"; 	break;
                    case "y" : temp ="-.--"; 	break;
                    case "z" : temp ="--.."; 	break;
                    case "0" : temp ="----"; 	break;
                    case "1" : temp =".----"; 	break;
                    case "2" : temp ="..--"; 	break;
                    case "3" : temp ="...--"; 	break;
                    case "4" : temp ="....-"; 	break;
                    case "5" : temp ="....."; 	break;
                    case "6" : temp ="-...."; 	break;
                    case "7" : temp ="--..."; 	break;
                    case "8" : temp ="---.."; 	break;
                    case "9" : temp ="----."; 	break;
                }
            }
        }
        else{
            switch (charValue){
                case ".-" 	: temp = "a";
                    break;
                case "-..."	: temp = "b";
                    break;
                case "-.-."	: temp = "c";
                    break;
                case "-.."	: temp = "d";
                    break;
                case "." 	: temp = "e";
                    break;
                case "..-."	: temp = "f";
                    break;
                case "--."	: temp = "g";
                    break;
                case "...."	: temp = "h";
                    break;
                case ".." 	: temp = "i";
                    break;
                case ".---"	: temp = "j";
                    break;
                case "-.-"	: temp = "k";
                    break;
                case ".-.."	: temp = "l";
                    break;
                case "--"	: temp = "m";
                    break;
                case "-." 	: temp = "n";
                    break;
                case "---"	: temp = "o";
                    break;
                case ".--."	: temp = "p";
                    break;
                case "--.-"	: temp = "q";
                    break;
                case ".-."	: temp = "r";
                    break;
                case "..."	: temp = "s";
                    break;
                case "-" 	: temp = "t";
                    break;
                case "..-"	: temp = "u";
                    break;
                case "...-"	: temp = "v";
                    break;
                case ".--"	: temp = "w";
                    break;
                case "-..-"	: temp = "x";
                    break;
                case "-.--"	: temp = "y";
                    break;
                case "--.."	: temp = "z";
                    break;
                case "----"	: temp = "0";
                    break;
                case ".----": temp = "1";
                    break;
                case "..--"	: temp = "2";
                    break;
                case "...--": temp = "3";
                    break;
                case "....-": temp = "4";
                    break;
                case ".....": temp = "5";
                    break;
                case "-....": temp = "6";
                    break;
                case "--...": temp = "7";
                    break;
                case "---..": temp = "8";
                    break;
                case "----.": temp = "9";
                    break;
            }

        }
        return temp;
    }
}

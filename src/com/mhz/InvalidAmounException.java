package com.mhz;
//checked ->Exception
//Unchecked ->RuntimeException
public class InvalidAmounException extends Exception{
    public InvalidAmounException(){
        super("Invalid amount");
    }
    public InvalidAmounException(String message) {
        super(message);
    }
}

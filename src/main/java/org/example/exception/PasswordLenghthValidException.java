package org.example.exception;

public class PasswordLenghthValidException extends Exception{
    public PasswordLenghthValidException(String errorMsg)
    {
        super(errorMsg);
    }
}

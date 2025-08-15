package org.example.exception;

public class PasswordUpperLetterCaseValidException extends Exception{
    public PasswordUpperLetterCaseValidException(String errorMsg)
    {
        super(errorMsg);
    }
}

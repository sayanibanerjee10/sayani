package org.example.exception;

public class PasswordLowerLetterCaseValidException extends Exception {
    public PasswordLowerLetterCaseValidException(String errorMsg)
    {
        super(errorMsg);
    }
}

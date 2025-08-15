package org.example;

import org.example.exception.*;

public class Main {
    public static void main(String[] args) throws PasswordValueNullException, PasswordLenghthValidException, PasswordUpperLetterCaseValidException, PasswordLowerLetterCaseValidException, PasswordDigitValidException {

        try {
            int countValidCondition = passwordValidate(password);
            if (countValidCondition >= 3) {
                System.out.println("Password is OK");
            } else {
                System.out.println("Password is never OK");
            }
        } catch (PasswordValueNullException e) {
            System.out.println("PasswordValueNullException : " + e.getMessage());
        } catch (PasswordLenghthValidException e) {
            System.out.println("PasswordLenghthValidException : " + e.getMessage());
        } catch (PasswordUpperLetterCaseValidException e) {
            System.out.println("PasswordUpperLetterCaseValidException : " + e.getMessage());
        } catch (PasswordLowerLetterCaseValidException e) {
            System.out.println("PasswordLowerLetterCaseValidException : " + e.getMessage());
        } catch (PasswordDigitValidException e) {
            System.out.println("PasswordDigitValidException : " + e.getMessage());
        }
    }

    public static int passwordValidate(String password) throws PasswordValueNullException, PasswordLenghthValidException, PasswordUpperLetterCaseValidException, PasswordLowerLetterCaseValidException, PasswordDigitValidException {
        int countValidCondition = 0;
        if (password.length() != 0) {
            countValidCondition++;
        } else {
            throw new PasswordValueNullException("Password cannot be empty or null");
        }
        if (password.length() > 8) {
            countValidCondition++;
        } else {
            throw new PasswordLenghthValidException("Password has less than 8 charectors");
        }
        if (password.chars().anyMatch(Character::isUpperCase)) {
            countValidCondition++;
        } else {
            throw new PasswordUpperLetterCaseValidException("Password should have atleast one upper letter");
        }
        if (password.chars().anyMatch(Character::isLowerCase)) {
            countValidCondition++;
        } else {
            throw new PasswordLowerLetterCaseValidException("Password should have atleast one lower letter");
        }
        if (password.chars().anyMatch(Character::isDigit)) {
            countValidCondition++;
        } else {
            throw new PasswordDigitValidException("Password should have atleast one digit");
        }

        return countValidCondition;
    }
}

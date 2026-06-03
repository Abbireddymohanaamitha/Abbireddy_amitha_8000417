package com.practice.exceptions;

/**
 * Custom checked exception to illustrate domain-specific error handling.
 */
public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

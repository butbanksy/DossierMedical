package com.banksy.exceptions;

public class PatientNotFoundException extends Exception {
    public PatientNotFoundException(String message){
        super(message);
    }
}

package com.javaproject.daytwentyone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public boolean validateFirstName(String firstName){
        boolean valid = Pattern.matches("[A-Z]{1}[a-zA-Z]+", firstName);
        return valid;
    }

    public boolean validateLastName(String lastName){
        boolean valid = Pattern.matches("[A-Z]{1}[a-zA-Z]+", lastName);
        return valid;
    }

    public boolean validateEmail(String email) {
        boolean valid = Pattern.matches("^[a-zA-Z]+[-\\+\\_\\.a-zA-Z0-9]+[@][a-zA-Z0-9]+([.]?[a-zA-Z\\,]{2,3}){2,3}",email);
        return valid;
    }

    public boolean validateMobileNumber(String mobile) {
        boolean valid = Pattern.matches("[+91|0|91]?[9876][0-9]{9}", mobile);
        return valid;
    }

    public boolean validatePassword(String password) {
        boolean valid = Pattern.matches("(.{8,}[A-Z0-9]?[+.$#@!&%*]?)", password);
        return valid;
    }

    public boolean userFirstName(String firstName){
        Pattern pattern = Pattern.compile("[A-Z]{1}[a-zA-Z]+");
        Matcher matcher = pattern.matcher(firstName);
        boolean value = matcher.matches();
        if(!matcher.matches()){
            try {
                throw new MoodAnalyserException();
            } catch (MoodAnalyserException e) {
                System.out.println("Invalid First Name");
            }
        }
        return value;
    }

    public boolean userLastName(String lastName){
        Pattern pattern = Pattern.compile("[A-Z]{1}[a-zA-Z]+");
        Matcher matcher = pattern.matcher(lastName);
        boolean value = matcher.matches();
        if(!matcher.matches()){
            try {
                throw new MoodAnalyserException();
            } catch (MoodAnalyserException e) {
                System.out.println("Invalid Last Name");
            }
        }
        return value;
    }

    public boolean userEmail(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z]+[-\\+\\_\\.a-zA-Z0-9]+[@][a-zA-Z0-9]+([.]?[a-zA-Z\\,]{2,3}){2,3}");
        Matcher matcher = pattern.matcher(email);
        boolean value = matcher.matches();
        if (!matcher.matches()) {
            try {
                throw new MoodAnalyserException();
            } catch (MoodAnalyserException e) {
                System.out.println("Invalid Email");
            }
        }
        return value;
    }

    public boolean userPassword(String password){
        Pattern pattern = Pattern.compile("(.{8,}[A-Z0-9]?[+.$#@!&%*]?)");
        Matcher matcher = pattern.matcher(password);
        boolean value = matcher.matches();
        if(!matcher.matches()){
            try {
                throw new MoodAnalyserException();
            } catch (MoodAnalyserException e) {
                System.out.println("Invalid Password");
            }
        }
        return value;
    }

    public boolean userMobileNumber(String mobileNumber){
        Pattern pattern = Pattern.compile("^\\+[0-9]{2}[ ][1-9][0-9]{9}$");
        Matcher matcher = pattern.matcher(mobileNumber);
        boolean value = matcher.matches();
        if(!matcher.matches()){
            try {
                throw new MoodAnalyserException();
            } catch (MoodAnalyserException e) {
                System.out.println("Invalid Mobile Number");
            }
        }
        return value;
    }
}
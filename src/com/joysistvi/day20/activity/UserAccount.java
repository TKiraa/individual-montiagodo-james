package com.joysistvi.day20.activity;

public class UserAccount {

    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setFirstName(String firstName) {
        this.firstName  = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        if (isEmpty(email)) {
            throw new IllegalArgumentException("\nEmail cannot be empty.");
        }
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email.");
        }
        this.email = email;
    }

    public void setPassword(String password) {
        if (isEmpty(password)) {
            throw new IllegalArgumentException("Password cannot be empty.");
        }
        if (!isValidPassword(password)) {
            throw new IllegalArgumentException("Invalid password.");
        }
        this.password = password;
    }

    // Empty check
    public static boolean isEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    // Email validation
    public static boolean isValidEmail(String email) {
        return email != null
                && email.length() <= 254
                && email.matches(
                "^[A-Za-z0-9]+([._%+-][A-Za-z0-9]+)*"
                        + "@" + "([A-Za-z0-9]+(-[A-Za-z0-9]+)*\\.)+[A-Za-z]{2,}$"
        );
    }

    // Password validation
    public static boolean isValidPassword(String password) {
        return password != null
                && password.length() >= 8
                && password.matches(".*[A-Z].*")
                && password.matches(".*[a-z].*")
                && password.matches(".*[0-9].*")
                && password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
    }
}

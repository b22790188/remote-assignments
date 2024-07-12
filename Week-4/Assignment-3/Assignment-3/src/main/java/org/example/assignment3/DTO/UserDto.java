package org.example.assignment3.DTO;

import jakarta.validation.constraints.NotEmpty;

public class UserDto {

    //todo: handle empty error
    @NotEmpty(message = "Input your email!")
    private String email;
    @NotEmpty(message = "Input your password!")
    private String password;

    UserDto(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

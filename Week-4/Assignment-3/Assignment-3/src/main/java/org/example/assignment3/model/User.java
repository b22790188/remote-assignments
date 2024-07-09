package org.example.assignment3.model;

public class User {
    private long id;
    private String email;
    private String password;

    public User() {}

    public User(long id, String password, String email) {
        setId(id);
        setEmail(email);
        setPassword(password);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

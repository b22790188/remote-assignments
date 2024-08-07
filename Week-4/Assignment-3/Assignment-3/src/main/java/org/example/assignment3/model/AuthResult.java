package org.example.assignment3.model;

public class AuthResult {
    private String message;
    private String filePath;

    public AuthResult(String message, String filePath) {
        setMessage(message);
        setFilePath(filePath);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}

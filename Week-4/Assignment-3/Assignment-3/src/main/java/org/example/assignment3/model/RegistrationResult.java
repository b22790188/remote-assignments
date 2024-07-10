package org.example.assignment3.model;

public class RegistrationResult {
    private String message;
    private String templateName;

    public RegistrationResult(String message, String templateName) {
        setMessage(message);
        setTemplateName(templateName);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }
}

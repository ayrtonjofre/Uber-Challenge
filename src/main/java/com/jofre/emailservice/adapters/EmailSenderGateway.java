package com.jofre.emailservice.adapters;

public interface EmailSenderGateway {
    void sendEmail(String to, String subject, String body);
}

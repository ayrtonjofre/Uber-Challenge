package com.jofre.emailservice.core;

public interface EmailSenderUseCase {
    void sendEmail(String to, String subject, String body);
}

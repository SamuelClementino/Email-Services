package com.sam.email_services.core;

public interface EmailSenderUseCase {

    void sendEmail(String to, String subject, String body);
}

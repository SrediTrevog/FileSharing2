package org.project.service;


import org.project.utils.dto.MailParams;

public interface MailSenderService {
    void send(MailParams mailParams);
}

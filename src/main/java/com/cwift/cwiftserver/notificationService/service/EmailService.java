package com.cwift.cwiftserver.notificationService.service;

import com.cwift.cwiftserver.notificationService.model.Email;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.util.Date;

@Service
@Slf4j
public class EmailService {


    private final JavaMailSender javaMailSender;

    public EmailService ( JavaMailSender javaMailSender ) {
        this.javaMailSender = javaMailSender;
    }

    public void mail( Email email ) throws MessagingException, UnsupportedEncodingException {
        try {

            MimeMessage mail = javaMailSender.createMimeMessage ();
            MimeMessageHelper helper = new MimeMessageHelper ( mail );

            helper.setTo ( email.getTo () );
            helper.setFrom ( "nzuri.mail@gmail.com", "no-reply" );
            helper.setText ( email.getBody () , true);
            helper.setSubject ( email.getSubject () );
            helper.setSentDate ( new Date () );

            javaMailSender.send ( mail );

            log.info("{} forwarded to {}", email.getSubject (), email.getTo ());
        }catch (Exception e){
            log.info("Sending an email to {} failed : {}",email.getTo () ,e.getLocalizedMessage());
            throw e;
        }
    }
}

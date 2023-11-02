package com.cwift.cwiftserver.notificationService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Email {

    private String to;
    private String subject;
    private String from;
    private String body;
    private final Date sendDate = new Date ();
}

package com.bharath.usermanagement.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class EmailRequestInfo {
private String from;
private List<String> to;
private List<String> cc;
private List<String> bcc;
private String message;
private String subject;
private  Attachments[] attachments;
private String password;

}

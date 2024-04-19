package com.bharath.usermanagement.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Attachments {
	private String fileName;
	private byte[] file;
}

package com.bharath.usermanagement.controller.mscommunication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import com.bharath.usermanagement.model.EmailRequestInfo;
import com.bharath.usermanagement.utility.UserServiceConstants;

@Component(value = "notificationService")
public class NotificationServiceImpl implements NotificationService {

	@Autowired
	private WebClient.Builder webclient;

	@Override
	public void sendEmail(EmailRequestInfo emailRequestInfo) {
		webclient.baseUrl(UserServiceConstants.NOTIFACTION_MS_BASE_URL).build().post()
				.uri(UserServiceConstants.SEND_EMAIL_PATH).bodyValue(emailRequestInfo).retrieve()
				.bodyToMono(String.class).block();

	}

}

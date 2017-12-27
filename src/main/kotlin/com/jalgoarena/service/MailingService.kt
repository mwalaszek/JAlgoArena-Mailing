package com.jalgoarena.service

import net.sargue.mailgun.Configuration
import net.sargue.mailgun.Mail
import org.apache.http.HttpStatus
import org.springframework.stereotype.Service
import javax.inject.Inject


@Service
class MailingService (
        @Inject private val configuration: Configuration
) {
    fun send(receiver: String, subject: String, message: String): Int {
        val response = Mail.using(configuration)
                .to(receiver)
                .subject(subject)
                .text(message)
                .build()
                .send()

        return if (response.isOk){
            HttpStatus.SC_CREATED
        } else{
            HttpStatus.SC_BAD_REQUEST
        }
    }

}
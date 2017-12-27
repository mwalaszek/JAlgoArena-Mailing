package com.jalgoarena.web

import com.jalgoarena.dto.EmailDto
import com.jalgoarena.service.MailingService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.inject.Inject

@RestController
class MailingController(
        @Inject private val service: MailingService
) {
    @PostMapping("/sendEmail")
    fun sendEmail(@RequestBody emailDto: EmailDto) : Int =
            service.send(emailDto.receiver, emailDto.subject, emailDto.message)
}
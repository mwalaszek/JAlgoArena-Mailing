package com.jalgoarena

import net.sargue.mailgun.Configuration
import org.springframework.beans.factory.FactoryBean
import org.springframework.boot.context.properties.ConfigurationProperties

@org.springframework.context.annotation.Configuration
@ConfigurationProperties(prefix = "mailgun")
open class MailgunConfigFactory (): FactoryBean<Configuration> {

    open var domain: String? = null
    open var apiKey: String? = null
    open var name: String? = null
    open var email: String? = null

    override fun getObject(): Configuration {
        return Configuration()
                .domain(domain)
                .apiKey(apiKey)
                .from(name, email)
    }

    override fun getObjectType(): Class<*> {
        return Configuration::class.java
    }

    override fun isSingleton(): Boolean {
        return true
    }
}
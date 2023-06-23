package com.algaworks.algafood;

import com.algaworks.algafood.di.notification.NotifierEmail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificationConfig {
    @Bean
    public NotifierEmail notifierEmail() {
        NotifierEmail notifier = new NotifierEmail("smtp.algamail.com.br");
        notifier.setCapsLock(true);

        return notifier;
    }

}

package com.algaworks.algafood;

import com.algaworks.algafood.di.notification.Notifier;
import com.algaworks.algafood.di.service.ActivateClientService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public ActivateClientService activateClientService(Notifier notifier) {
        return new ActivateClientService(notifier);
    }
}

package com.algaworks.algafood.di.service;

import com.algaworks.algafood.di.model.Client;
import com.algaworks.algafood.di.notification.Notifier;
import org.springframework.stereotype.Component;

@Component
public class ActivateClientService {
    private Notifier notifier;

    public ActivateClientService(Notifier notifier) {
        this.notifier = notifier;

        System.out.println("ActivateClientService: " + notifier);
    }

    public void activate(Client client) {
        client.activate();

        this.notifier.notify(client, "Seu cadastro está ativo!");
    }
}

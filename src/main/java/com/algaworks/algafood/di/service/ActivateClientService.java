package com.algaworks.algafood.di.service;

import com.algaworks.algafood.di.model.Client;
import com.algaworks.algafood.di.notification.LevelOfUrgency;
import com.algaworks.algafood.di.notification.Notifier;
import com.algaworks.algafood.di.notification.NotifierType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ActivateClientService {
    @NotifierType(LevelOfUrgency.WITHOUT_URGENCY)
    @Autowired
    private Notifier notifier;

    public void activate(Client client) {
        client.activate();
        this.notifier.notify(client, "Seu cadastro está ativo!");
    }
}

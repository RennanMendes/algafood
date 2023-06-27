package com.algaworks.algafood.di.notification;

import com.algaworks.algafood.di.model.Client;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@NotifierType(LevelOfUrgency.URGENT)
@Component
public class NotifierSMS implements Notifier {
    @Override
    public void notify(Client client, String message) {
        System.out.printf("Notificando %s por SMS através do número %s: %s\n", client.getName(), client.getPhone(), message);
    }

}

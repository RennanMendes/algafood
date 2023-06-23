package com.algaworks.algafood.di.notification;

import com.algaworks.algafood.di.model.Client;
import org.springframework.stereotype.Component;

@Component
public class NotifierEmail implements Notifier {

    public NotifierEmail(){
        System.out.println("NotifierEmail");
    }
    @Override
    public void notify(Client client, String message) {
        System.out.printf("Notificando %s através do e-mail %s: %s\n", client.getName(), client.getEmail(), message);
    }
}

package com.algaworks.algafood.di.notification;

import com.algaworks.algafood.di.model.Client;
import org.springframework.stereotype.Component;

public class NotifierEmail implements Notifier {
    private boolean capsLock;
    private String hostSmtpServer;

    public NotifierEmail(String hostSmtpServer) {
        this.hostSmtpServer = hostSmtpServer;
        System.out.println("NotifierEmail");
    }

    @Override
    public void notify(Client client, String message) {
        if (capsLock) {
            message = message.toUpperCase();
        }

        System.out.printf("Notificando %s através do e-mail %s usando SMPT %s: %s\n",
                client.getName(), client.getEmail(), this.hostSmtpServer, message);
    }

    public void setCapsLock(boolean capsLock) {
        this.capsLock = capsLock;
    }
}

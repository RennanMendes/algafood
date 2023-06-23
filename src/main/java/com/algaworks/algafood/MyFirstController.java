package com.algaworks.algafood;

import com.algaworks.algafood.di.model.Client;
import com.algaworks.algafood.di.service.ActivateClientService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyFirstController {

    private ActivateClientService activateClientService;

    public MyFirstController(ActivateClientService activateClientService) {
        this.activateClientService = activateClientService;
        System.out.println("MyFirstController: " + activateClientService);
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        Client joao = new Client("João","joao@xyz.com","11 99999-5555");
        activateClientService.activate(joao);

        return "Hello World!";
    }
}

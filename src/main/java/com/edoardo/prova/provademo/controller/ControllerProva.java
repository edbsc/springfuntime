package com.edoardo.prova.provademo.controller;

import com.edoardo.prova.provademo.entita.Saluti;
import org.springframework.core.io.UrlResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.MalformedURLException;
@RestController
public class ControllerProva
{
    private static final String message = "Ciao , %s";

    @GetMapping("/ciao")
    public Saluti saluti() throws MalformedURLException, IOException
    {

        UrlResource url = new UrlResource("http://checkip.amazonaws.com/");
        byte [] ip = url.getInputStream().readAllBytes();
        String s="";
        for(byte b : ip)
        {
            s+=(char)b;


        }
         return new Saluti(1,String.format(message,s));


    }

}

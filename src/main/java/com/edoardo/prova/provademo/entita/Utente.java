package com.edoardo.prova.provademo.entita;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Utente
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String username ;
    private String Ip;

    protected Utente(){}
    public Utente(long id ,String username,String Ip)
    {
        this.id = id ;
        this.username = username;
        this.Ip = Ip;
    }
    @Override
    public String toString()
    {
        return String.format("%d , %s %s ",id,username,Ip);
    }
    public long getId()
    {
        return  id;
    }
    public String getUsername()
    {
        return username;
    }
    public String getIp()
    {
        return Ip;
    }


}

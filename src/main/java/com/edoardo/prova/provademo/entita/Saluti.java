package com.edoardo.prova.provademo.entita;

public class Saluti {

    private long id;
    private final String content;
    public Saluti(long id, String content)
    {
        this.id=id;
        this.content= content;

    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}

package org.example;

public class Usuario {

    private String nome;
    private Number id;
    private Boolean isOnline;
    private Boolean isPlayingSomething;

    public Usuario(String nome, Number id, Boolean isOnline, Boolean isPlayingSomething ) {
        this.nome = nome;
        this.id = id;
        this.isOnline = isOnline;
        this.isPlayingSomething = isPlayingSomething;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Number getId() {
        return id;
    }

    public void setId(Number id) {
        this.id = id;
    }

    public Boolean getIsOnline() { return  isOnline;}

    public void setIsOnline(Boolean isOnline) {this.isOnline = isOnline;}

    public Boolean getPlayingSomething() {
        return isPlayingSomething;
    }

    public void setPlayingSomething(Boolean playingSomething) {this.isPlayingSomething = playingSomething;}
}

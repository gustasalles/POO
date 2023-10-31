package org.example;

public abstract class Automovel {
    private String marca;
    private String modelo;
    private int ano;

    public Automovel(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void ligar() {
        System.out.println("o automovel esta ligando");
    }

    public void desligar() {
        System.out.println("o automovel esta desligando");
    }

    public void acelerar() {
        System.out.println("o automovel esta acelerando");
    }
    public abstract void abastecer();


}


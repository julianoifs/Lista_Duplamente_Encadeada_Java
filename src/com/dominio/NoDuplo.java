package com.dominio;

public class NoDuplo<T> {

    private T info;
    private NoDuplo<T> proximo;
    private NoDuplo<T> anterior;

    public NoDuplo(T valor) {
        this.info = valor;
        this.proximo = null;
        this.anterior = null;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public NoDuplo<T> getProximo() {
        return proximo;
    }

    public void setProximo(NoDuplo<T> proximo) {
        this.proximo = proximo;
    }

    public NoDuplo<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NoDuplo<T> anterior) {
        this.anterior = anterior;
    }

}

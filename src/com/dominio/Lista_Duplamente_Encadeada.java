package com.dominio;

public class Lista_Duplamente_Encadeada<T> {

    private NoDuplo<T> inicio;
    private NoDuplo<T> fim;
    private int tamanho;

    public Lista_Duplamente_Encadeada() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public void addInicio(T elemento) {
        NoDuplo<T> no = new NoDuplo<T>(elemento);

        if (this.tamanho == 0) {
            this.fim = no;
        } else {
            no.setProximo(this.inicio);
            this.inicio.setAnterior(no);
        }
        this.inicio = no;
        this.tamanho++;
    }

    public boolean eVazio() {
        if (this.tamanho == 0) {
            return false;            
        }
        return true;
    }

    public T mostrarLista() {
        if (this.tamanho == 0) {
            return (T) ("[ ]");
        }
        StringBuilder sb = new StringBuilder("[");
        NoDuplo atual = this.inicio;

        for (int i = 0; i < this.tamanho - 1; i++) {
            sb.append(atual.getInfo()).append(", ");
            atual = atual.getProximo();            
        }
        sb.append(atual.getInfo()).append("]");

        return (T) sb.toString();
    }

}

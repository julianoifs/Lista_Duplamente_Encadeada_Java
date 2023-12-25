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

    // Adiciona no início da lista
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

    // Adiciona no final da lista
    public void addFinal(T elemento) {
        NoDuplo<T> dNo = new NoDuplo<T>(elemento);
        NoDuplo<T> end = this.fim;

        if (this.tamanho == 0) {
            this.inicio = dNo;
        } else {
            this.fim.setProximo(dNo);
            dNo.setAnterior(end);
        }
        this.fim = dNo;
        this.tamanho++;
    }

    // remove do início da lista
    public void removerinicio() throws Exception {
        NoDuplo<T> atual = this.inicio;

        if (this.tamanho == 0) {
            throw new Exception("[ ]");
        } else if (this.tamanho == 1) {
            this.inicio = null;
            this.fim = null;
        } else {
            this.inicio = this.inicio.getProximo();
            this.inicio.setAnterior(null);
            atual = null;
        }
        this.tamanho--;
    }

    // remove do final da lista
    public void removerFinal() throws Exception {
        NoDuplo<T> end = this.fim;

        if (this.tamanho == 0) {
            throw new Exception("[ ]");
            } else if (this.tamanho == 1) {
                this.inicio = null;
                this.fim = null;
            } else {
                this.fim = this.fim.getAnterior();
                end = null;
            }
            this.tamanho--;
    }

    // Verificar se a lista possui elemento
    public boolean eVazio() {
        if (this.tamanho == 0) {
            return false;
        }
        return true;
    }

    // retorna o tamanho da lista
    public int getTamanho() {
        return this.tamanho;
    }

    // Exibir elementos da lista, se a lista possuir elementos
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

package com.dominio;

public class Main {

    public static void main(String[] args) {
        
        // Teste dos métodos desenvolvidos
        Lista_Duplamente_Encadeada<Integer> lista = new Lista_Duplamente_Encadeada<>();

        System.out.println("Antes de adicionar elementos da lista\n");
        System.out.println("A lista possui elementos? " + lista.eVazio());
        System.out.println("Tmanho: " + lista.getTamanho());

        // Adicionado elemento na lista
        lista.addInicio(1);
        lista.addInicio(2);
        lista.addInicio(3);
        lista.addInicio(4);
        lista.addInicio(5);
        lista.addInicio(6);

        System.out.println("\nApós adidcionar elementos na lista\n");
        System.out.println("Lista\n" + lista.mostrarLista());

    }
}

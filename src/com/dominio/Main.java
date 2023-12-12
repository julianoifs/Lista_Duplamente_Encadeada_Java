package com.dominio;

public class Main {

    public static void main(String[] args) {
        
        Lista_Duplamente_Encadeada<Integer> lista = new Lista_Duplamente_Encadeada<>();

        lista.addInicio(1);
        lista.addInicio(2);
        lista.addInicio(3);
        lista.addInicio(4);
        lista.addInicio(5);
        lista.addInicio(6);

        System.out.println(lista.mostrarLista());

    }
}

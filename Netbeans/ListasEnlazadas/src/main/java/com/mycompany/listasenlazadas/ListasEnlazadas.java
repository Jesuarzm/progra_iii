
package com.mycompany.listasenlazadas;

import java.util.Scanner;


public class ListasEnlazadas {

    public static void main(String[] args) {
        
        Lista miLista=new Lista();
        miLista.agregandoAlInicio("Inicio");
        miLista.agregandoAlInicio("Ana");
        miLista.agregandoAlInicio("Tere");
        miLista.agregandoAlInicio("Pedro");
        miLista.agregandoAlInicio("Final");
        
        
        miLista.agregandoAlInicio("Final2");
        miLista.agregandoAlInicio("Jose");
        miLista.agregandoAlInicio("Rosario");
        miLista.agregandoAlInicio("Tito");
        miLista.agregandoAlInicio("Lucia");
        miLista.agregandoAlInicio("Inicio2");
        
        miLista.mostrarLista();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("\nIngrese el nombre a buscar: ");
        String buscando = sc.next();
        if(miLista.buscarDato(buscando)){
            System.out.println("El dato se encuentra");
        }else{
            System.out.println("El dato no se encuentra");
        }
        if(miLista.estaVacia()){
            System.out.println("\nLa Lista esta vacia");
        }else{
            
            System.out.println("\nLa Lista contiene datos");
        }
        
            System.out.println("\nCantidad de elementos en lista:" + miLista.cantidadNodos());
            System.out.println("\nCantidad de elementos en lista:" + miLista.primerElemento());
            System.out.println("\nCantidad de elementos en lista:" + miLista.ultimoElemento());
    }
}

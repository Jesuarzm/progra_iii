/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listasenlazadas;

/**
 *
 * @author laboratorio
 */
class Lista{
    Nodo inicio,fin;
    int cont=0;
    
    public boolean estaVacia(){
        return inicio==null;
    }
    public void agregandoAlInicio(String d){
        cont++;
        if (estaVacia()){
            inicio=new Nodo(d, inicio);
            fin = inicio;
        }else{
            inicio=new Nodo(d, inicio);
        }
    }
    public void agregarAlFinal(String d){
        cont++;
        if (estaVacia()){
            inicio=new Nodo(d);
            fin=inicio;
        }else{
            fin.siguiente=new Nodo(d);
            fin=fin.siguiente;
        }
    }
    public void mostrarLista(){
        Nodo aux=inicio;
        while(aux!=null){
            System.out.print("["+aux.dato+"]-->");
            aux=aux.siguiente;
        }
    }
    public int cantidadNodos(){
        return cont;
    }
    public String primerElemento(){
        return inicio.dato;
    }
    public String ultimoElemento(){
        return fin.dato;
    }
    public boolean buscarDato(String d){
        boolean encontrado=false;
        Nodo aux=inicio;
        while (encontrado!=true){
            if(d.equals(aux.dato)){
                encontrado = true;
            }else{
                aux=aux.siguiente;
            }
            if(encontrado == true) break;
        }
        return encontrado;
    }
}

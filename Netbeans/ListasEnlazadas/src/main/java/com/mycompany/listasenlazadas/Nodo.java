/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listasenlazadas;

/**
 *
 * @author laboratorio
 */
class Nodo {
    String dato;
    Nodo siguiente;
    
    public Nodo(String d, Nodo sig){
        dato = d;
        siguiente=sig;
    }
    public Nodo(String d){
        dato=d;
        siguiente=null;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manuelmartinez.base;

import java.util.List;

/**
 *
 * @author HP
 */
public class Documento {
    //PROPIEDADES
private String código;
private String descripción; 
private String tipo;
private Tarea tarea;
private List <Versión> ListaDeVersiones;

//Constructor por defecto
public Documento(){
}
//Constructor con parámetros
    public Documento(String código, String desc){
    this.código = código;
    this.descripción = desc;
    } 
}

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
public class Empresa {
private String nit;
private String nombre;
private String teléfono;
private String email;
private String tipo;
private String web;
private String dirección;
private List<Empleado> ListaDeEmpleados;
private List<Proyecto> ListaDeProyectos;

//Constructor por defecto
public Empresa(){
}
//Constructor con parámetros
    public Empresa(String nit, String nombre){
    this.nit = nit;
    this.nombre = nombre;
    } 
}

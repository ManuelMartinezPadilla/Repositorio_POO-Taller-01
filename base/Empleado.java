/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manuelmartinez.base;

import java.util.Date;
import java.util.List;

/**
 *
 * @author HP
 */
public class Empleado {
    //PROPIEDADES
protected String dni;
protected String nombre;
protected String apellidos;
protected String dirección;
protected String teléfono;
protected String email;
protected Date fechaContrato;
protected Empresa empresa;
protected List <Proyecto> ListaDeProyectos;
protected List <Tarea> ListaDeTareas;
    

//Constructor por defecto
public Empleado(){
}
//Constructor con parámetros
    public Empleado(String nombre, String apellido){
    this.nombre = nombre;
    this.apellidos = apellido;
    } 
}

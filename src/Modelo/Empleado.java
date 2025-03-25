/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Gena
 */
import java.util.Date;

public class Empleado {
    private int idEmpleado;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String celular;
    private String cargo;
    private Date fechaContratacion;

    public Empleado(int idEmpleado, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String celular, String cargo, Date fechaContratacion) {
        this.idEmpleado = idEmpleado;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.celular = celular;
        this.cargo = cargo;
        this.fechaContratacion = fechaContratacion;
    }

    public Empleado() {
    }
    
    
}

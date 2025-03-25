/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Gena
 */
public class Cliente {
    private int idCliente;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String celular;
    private String direccion;
    private String cedula;

    public Cliente(int idCliente, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String celular, String direccion, String cedula) {
        this.idCliente = idCliente;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.celular = celular;
        this.direccion = direccion;
        this.cedula = cedula;
    }

    public Cliente() {
    }
    
    
    
}

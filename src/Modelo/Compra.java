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
import java.util.List;

public class Compra {
    private int idCompra;
    private Empleado empleado; // Relación con Empleado
    private Date fechaCompra;
    private float totalCompra;
    private List<DetalleCompra> detalles; // Relación con DetalleCompra

    public Compra(int idCompra, Empleado empleado, Date fechaCompra, float totalCompra, List<DetalleCompra> detalles) {
        this.idCompra = idCompra;
        this.empleado = empleado;
        this.fechaCompra = fechaCompra;
        this.totalCompra = totalCompra;
        this.detalles = detalles;
    }

    public Compra() {
    }
    
    
}

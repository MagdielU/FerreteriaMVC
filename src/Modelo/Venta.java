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
public class Venta {
    private int idVenta;
    private Cliente cliente; // Relación con Cliente
    private Empleado empleado; // Relación con Empleado
    private Date fechaVenta;
    private float totalVenta;
    private List<DetalleVenta> detalles; // Relación con DetalleVenta

    public Venta(int idVenta, Cliente cliente, Empleado empleado, Date fechaVenta, float totalVenta, List<DetalleVenta> detalles) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.empleado = empleado;
        this.fechaVenta = fechaVenta;
        this.totalVenta = totalVenta;
        this.detalles = detalles;
    }

    public Venta() {
    }
    
    
}

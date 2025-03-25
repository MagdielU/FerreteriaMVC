/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Gena
 */
public class DetalleVenta {
    private int idDetalleVenta;
    private Venta venta; // Relación con Venta
    private Producto producto; // Relación con Producto
    private int cantidad;
    private float precioUnitario;

    public DetalleVenta(int idDetalleVenta, Venta venta, Producto producto, int cantidad, float precioUnitario) {
        this.idDetalleVenta = idDetalleVenta;
        this.venta = venta;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public DetalleVenta() {
    }
    
    
}

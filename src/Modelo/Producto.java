/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Gena
 */
public class Producto {
    private int idProducto;
    private String nombreProducto;
    private String descripcionProducto;
    private Categoria categoria; // Relación con Categoria
    private float precioUnitario;
    private int stock;
    private String imagen;

    public Producto(int idProducto, String nombreProducto, String descripcionProducto, Categoria categoria, float precioUnitario, int stock, String imagen) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.categoria = categoria;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
        this.imagen = imagen;
    }

    public Producto() {
    }
    
    
}

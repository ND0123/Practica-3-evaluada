/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Inventario {

    private Producto[] productos;
    private int totalProductos;
    private Empleado empleado;
    private Super supermercado;
    
    

    public Inventario() {
    }

        public Inventario(Producto[] productos, int totalProductos, Empleado empleado, Super supermercado) {
            this.productos = productos;
            this.totalProductos = totalProductos;
            this.empleado = empleado;
            this.supermercado = supermercado;
        }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public int getTotalProductos() {
        return totalProductos;
    }

    public void setTotalProductos(int totalProductos) {
        this.totalProductos = totalProductos;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Super getSupermercado() {
        return supermercado;
    }

    public void setSupermercado(Super supermercado) {
        this.supermercado = supermercado;
    }

    //Se utilizara en el main para verse mas limpio al solo llamarlo 
    public void mostrarProductos() {
        for (int i = 0; i < totalProductos; i++) {
            JOptionPane.showMessageDialog(null, "Producto: " + productos[i].getNombreProducto() + "con el codigo: " + productos[i].getCodigoProducto() + "tipo de producto: " + productos[i].getTipoProducto() + "Con un precio base de: " + productos[i].getPrecioBase() + "Y un precio bruto de: " + productos[i].getPrecioBruto() + "Teniendo una ganancia de: " + productos[i].getGanancia());
            

        }
    }
// Y este para calcular la ganancia total
    public double calcularGananciaTotal(){
        double total= 0;
        for (int i = 0; i < totalProductos; i++) {
            total += productos[i].getGanancia();
            
            
        }
        return total;
    }
    public void agregarProductos(){
        String lista= new lista();
        
    }
    
    @Override
    public String toString() {
        return "Inventario{" + "productos=" + productos + ", totalProductos=" + totalProductos + ", empleado=" + empleado + ", supermercado=" + supermercado + '}';
    }

    
    

    
    
    

}

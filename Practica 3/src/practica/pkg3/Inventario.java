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
    private int maxProductos;

    
    public Inventario(Empleado empleado, Super supermercado, int maxProductos) {
        this.empleado = empleado;
        this.supermercado = supermercado;
        this.maxProductos = maxProductos;
        productos = new Producto[maxProductos];
        totalProductos = 0;
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

    // Con esto solo lo llamamos en el main para que se vea mas limpio
    public void mostrarProductos() {
        for (int i = 0; i < totalProductos; i++) {
            Producto p = productos[i];
            JOptionPane.showMessageDialog(null,
                    "Producto: " + p.getNombreProducto() + 
                    "\nCódigo: " + p.getCodigoProducto() + 
                    "\nTipo: " + p.getTipoProducto() + 
                    "\nPrecio base: " + p.getPrecioBase() + 
                    "\nPrecio bruto: " + p.getPrecioBruto() + 
                    "\nGanancia: " + p.getGanancia());
        }
    }

    // Calcular la ganancia total 
    public double calcularGananciaTotal() {
        double total = 0;
        for (int i = 0; i < totalProductos; i++) {
            total += productos[i].getGanancia();
        }
        return total;
    }

    
    public void agregarProductos(Producto p) {
        if (totalProductos < productos.length) {
            productos[totalProductos] = p;
            totalProductos++;
        } else {
            JOptionPane.showMessageDialog(null, "No se pueden agregar más productos");
        }
    }

    
    public void cargarProductos() {
        String seguir = "s";

        while (seguir.equalsIgnoreCase("s") && totalProductos < productos.length) {
            String codigo = JOptionPane.showInputDialog("Ingrese código del producto:");
            if (codigo == null || codigo.equals("")) break;

            String nombre = JOptionPane.showInputDialog("Ingrese nombre del producto:");
            if (nombre == null || nombre.equals("")) break;

            String textoCantidad = JOptionPane.showInputDialog("Ingrese cantidad:");
            if (textoCantidad == null || textoCantidad.equals("")) break;
            int cantidad = Integer.parseInt(textoCantidad);

            String textoPrecio = JOptionPane.showInputDialog("Ingrese precio base:");
            if (textoPrecio == null || textoPrecio.equals("")) break;
            int precioBase = Integer.parseInt(textoPrecio);

            String tipo = JOptionPane.showInputDialog("Ingrese tipo de producto (Alimentos, Bebidas, Higiene, Limpieza):");
            if (tipo == null || tipo.equals("")) break;

            Producto p = new Producto(nombre, codigo, tipo, precioBase, cantidad);
            p.calcularPrecioBruto();
            p.calcularGanancia(cantidad);
            agregarProductos(p);

            seguir = JOptionPane.showInputDialog("¿Desea agregar otro producto? (s/n):");
            if (seguir == null) break;
        }
    }
    
    @Override
    public String toString() {
        return "Inventario{" + "productos=" + productos + ", totalProductos=" + totalProductos + ", empleado=" + empleado + ", supermercado=" + supermercado + '}';
    }

    
    

    
    
    

}

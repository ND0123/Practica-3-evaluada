/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String nombreSuper= JOptionPane.showInputDialog("Ingrese el nombre del Super: ");
    String codigoSuper= JOptionPane.showInputDialog("Ingrese el codigo del Super: ");
    String nombreEmpleado= JOptionPane.showInputDialog("Ingrese el nombre del empleado: ");
    String cedulaEmpleado= JOptionPane.showInputDialog("Ingrese la cedula del empleado: ");
    
    Super supermercado = new Super(nombreSuper, codigoSuper);
    Empleado empleado = new Empleado(nombreEmpleado, cedulaEmpleado);
    
    Inventario inventario = new Inventario(empleado, supermercado, 2);
    
    inventario.cargarProductos();
    inventario.mostrarProductos();
    
    JOptionPane.showMessageDialog(null, "La ganancia total esperada es: " + inventario.calcularGananciaTotal());
        
    }
    
}

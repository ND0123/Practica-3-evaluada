/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg3;

/**
 *
 * @author Laboratorio
 */
public class Producto {

    private String nombreProducto;
    private String codigoProducto;
    private String tipoProducto;
    private int precioBase;
    private double precioBruto;
    private double ganancia;
    private int cantidad;

    public Producto(String nombreProducto, String codigoProducto, String tipoProducto, int precioBase, int cantidad) {
        this.nombreProducto = nombreProducto;
        this.codigoProducto = codigoProducto;
        this.tipoProducto = tipoProducto;
        this.precioBase = precioBase;
        this.cantidad = cantidad;
        
    }

    public Producto() {
    }

    

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public double getPrecioBruto() {
        return precioBruto;
    }

    public void setPrecioBruto(double precioBruto) {
        this.precioBruto = precioBruto;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void calcularPrecioBruto() { //Metodo para calcular el precio bruto dependiendo de los productos
        switch (tipoProducto.toLowerCase()) {
            case "alimentos":
                precioBruto = precioBase * 1.20;
                break;
            case "bebidas":
                precioBruto = precioBase * 1.30;
                break;
            case "higiene":
                precioBruto = precioBase * 1.25 + 500;
                break;
            case "limpieza":
                precioBruto = precioBase * 1.19 + precioBase * 0.04 + 1000;
                break;
            default:
                precioBruto = precioBase; //Si llega a ser invalido

        }

    }

    //Calcular ganancia
    public void calcularGanancia(double cantidad) {
        ganancia = (precioBruto - precioBase) * cantidad;

    }

    @Override
    public String toString() {
        return "Producto{" + "nombreProducto=" + nombreProducto + ", codigoProducto=" + codigoProducto + ", tipoProducto=" + tipoProducto + ", precioBase=" + precioBase + ", precioBruto=" + precioBruto + ", ganancia=" + ganancia + ", cantidad=" + cantidad + '}';
    }

}

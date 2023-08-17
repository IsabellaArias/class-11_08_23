package Agregación;

public class Producto {
    private String nombre_producto;
    private int valor;

    public Producto(String nombre_producto, int valor) {
        this.nombre_producto = nombre_producto;
        this.valor = valor;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}

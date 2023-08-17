package Agregación;

public class Factura {
    private String numero_factura;
    private String fecha;
    Producto producto;

    public Factura(String numero_factura, String fecha, Producto producto) {
        this.numero_factura = numero_factura;
        this.fecha = fecha;
        this.producto = producto;
    }
}

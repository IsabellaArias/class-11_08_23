package herencia;

public class Animal {
    private String nombre;
    private String edad;

    public Animal(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
class Perro extends Animal{

    public Perro(String nombre, String edad) {
        super(nombre, edad);
    }
}
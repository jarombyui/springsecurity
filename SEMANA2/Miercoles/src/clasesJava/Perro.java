package clasesJava;
/// definiendo atributos
public class Perro {
    public   String nombre;
    public  String raza;
    public byte edad;

    /// definiendo constructor
    public Perro(String nombre, String raza, byte edad)
    {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;

    }
// definiendo metodos
    public void ladrar(){
        System.out.println("guau guau");
    }

    public void comer(){
        System.out.println("perro comiendo");
    }

}

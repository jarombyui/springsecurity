package staticMethods;

public class Usuario {

    String nombre;
    int edad;

    public static int contador = 0;

    public Usuario(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
        contador++;  /// este contara cada vez que se cree un usuario, e ira aumentando de uno en uno
    }
}

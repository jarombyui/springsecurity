package clasesJava;

import java.lang.ref.SoftReference;
import java.util.Date;
/// Atributos
public class Computadora {
    public String marca;
    public String modelo;
    public byte ram;
    public int memoria;
    public Date fechaFactory;
    public float velocidad;

// Constructor
public Computadora(String marca, String modelo, byte ram, int memoria, Float velocidad)
{
    this.marca = marca;
    this.modelo = modelo;
    this.ram = ram;
    this.memoria = memoria;
    this.velocidad = velocidad;
}

// Methods

public void encender()
{
    System.out.println("Hello!, I am you laptop " + marca + " y estoy lista para trabajar a una " + velocidad + "listo?");
}
}

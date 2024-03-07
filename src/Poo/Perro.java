package Poo;
// public, private
public class Perro {
    private String nombre;
    private String raza;
    private String edad;
    // definir un metodo ladrar, que no retorne ningun valor
    // imprimir guau guau
    void printInfo()
    {
        System.out.println(nombre);
        System.out.println(raza);
        System.out.println(edad);
    }
    public String getNombre()
    {
        return nombre;
    }
    public String getRaza()
    {
        return raza;
    }
    public String getEdad()
    {
        return edad;
    }
    // setters
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public void setRaza(String raza)
    {
        this.raza = raza;
    }
    public void setEdad(String edad)
    {
        this.edad = edad;
    }
}

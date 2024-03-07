package Poo;

public class Usuario {
    // atributos
    String nombre;
    String apellido;
    int edad;
    String password;
    public Usuario(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public Usuario() {
    }
    public Usuario(String nombre, String apellido, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
    }
    // metodos
    // login

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    String login(String nombre, String password)
    {
        System.out.println("Logging de aplicativo");
        // logica de validacion
        String respuesta = "El usuario con el nombre " + nombre + "se logro autenticar";
        return respuesta;
    }
    void saludar()
    {
        System.out.println("Hola a todos");
    }
    void saludarPersona(String nombre)
    {
        System.out.println("Hola " + nombre);
    }
}

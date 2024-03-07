package Poo;

public class App {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("George", "Maxi", 27);
        Usuario usuario2 = new Usuario("Maria", "Maxi", 20);

        Perro perro = new Perro();
        perro.setNombre("Chester");
        perro.setRaza("Pastor Aleman");
        perro.setEdad("12");

        usuario1.setNombre("Jorge");

        /*usuario1.nombre = "George";
        usuario2.nombre = "Maria";

        usuario1.apellido = "Maxi";
        usuario2.apellido = "Maxi";

        usuario1.edad = 24;
        usuario2.edad = 20;

        usuario1.saludar();
        usuario1.saludarPersona("Jose Armando");

        String respuestaMetodo = usuario1.login("George", "123345");
        System.out.println(respuestaMetodo);*/
    }
}
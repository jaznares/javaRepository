package propio;

public class Prueba {

    public static void main(String[] args) {
        Persona persona = new Persona();
        System.out.println(persona.nombre);
        cambiar(persona);
        System.out.println(persona.nombre);
        Persona p2 = new Cliente();
        System.out.println(p2.nombre);
        p2 = persona;
        System.out.println(p2.nombre);

    }

    public static void cambiar(Persona p) {
        p = new Cliente();
        System.out.println(p.nombre);
    }
}

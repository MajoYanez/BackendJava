package PracticaHarry;

public class PruebaVoldemort {
    public static void main(String[] args) {
        def();

    }

    // . operador de direccion
    public static void def() {
        Voldemort PersonajeVoldemort = new Voldemort();
        PersonajeVoldemort.setCasa("Slytherin");
        PersonajeVoldemort.setGenero("Masculino");
        PersonajeVoldemort.setNombre("Tom Readle");
        PersonajeVoldemort.setBoggart("Su propio cuerpo muerto.");
        PersonajeVoldemort.setPatronus("Serpiente");

        String msg = "Soy un personaje de la saga Harry Potter: ";
        msg += "\nNombre: " + PersonajeVoldemort.getNombre();
        msg += "\nCasa: " + PersonajeVoldemort.getCasa();
        msg += "\nGenero: " + PersonajeVoldemort.getGenero();
        msg += "\nBoggart: " + PersonajeVoldemort.getBoggart();
        msg += "\nPatronus: " + PersonajeVoldemort.getPatronus();
        System.out.print(msg);
    }
}


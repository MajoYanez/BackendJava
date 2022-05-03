package PracticaHarry;

public class PruebaHermione {
    public static void main(String[] args) {
        def();

    }

    // . operador de direccion
    public static void def() {
        Hermione PersonajeHermione = new Hermione();
        PersonajeHermione.setCasa("Gryffindor");
        PersonajeHermione.setGenero("Femenino");
        PersonajeHermione.setNombre("Hermione Granjer");
        PersonajeHermione.setBoggart("Reprobar");
        PersonajeHermione.setPatronus("Nutria");

        String msg = "Soy un personaje de la saga Harry Potter: ";
        msg += "\nNombre: " + PersonajeHermione.getNombre();
        msg += "\nCasa: " + PersonajeHermione.getCasa();
        msg += "\nGenero: " + PersonajeHermione.getGenero();
        msg += "\nBoggart: " + PersonajeHermione.getBoggart();
        msg += "\nPatronus: " + PersonajeHermione.getPatronus();

        System.out.print(msg);
    }

}

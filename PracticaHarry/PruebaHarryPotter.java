package PracticaHarry;

public class PruebaHarryPotter {
    public static void main(String[] args) {
        def();

    }

    // . operador de direccion
    public static void def() {
        HarryPotter PersonajeHarryPotter = new HarryPotter();
        PersonajeHarryPotter.setCasa("Gryffindor");
        PersonajeHarryPotter.setGenero("Masculino");
        PersonajeHarryPotter.setNombre("Harry James Potter");
        PersonajeHarryPotter.setBoggart("Dementor");
        PersonajeHarryPotter.setPatronus("Ciervo");

        String msg = "Soy un personaje de la saga Harry Potter: ";
        msg += "\nNombre: " + PersonajeHarryPotter.getNombre();
        msg += "\nCasa: " + PersonajeHarryPotter.getCasa();
        msg += "\nGenero: " + PersonajeHarryPotter.getGenero();
        msg += "\nBoggart: " + PersonajeHarryPotter.getBoggart();
        msg += "\nPatronus: " + PersonajeHarryPotter.getPatronus();
        System.out.print(msg);
    }
}

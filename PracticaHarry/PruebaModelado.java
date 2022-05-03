package PracticaHarry;

public class PruebaModelado {
    public static void main(String[] args) {
        def();

    }

    // . operador de direccion
    public static void def() {
        Modelado PersonajeHarryPotter = new Modelado();
        PersonajeHarryPotter.setCasa("Gryffindor");
        PersonajeHarryPotter.setGenero("Masculino");
        PersonajeHarryPotter.setNombre("Harry James Potter");
        PersonajeHarryPotter.setBoggart("Dementor");
        PersonajeHarryPotter.setPatronus("Ciervo");

        Modelado PersonajeHermione = new Modelado();
        PersonajeHermione.setCasa("Gryffindor");
        PersonajeHermione.setGenero("Femenino");
        PersonajeHermione.setNombre("Hermione Granjer");
        PersonajeHermione.setBoggart("Reprobar");
        PersonajeHermione.setPatronus("Nutria");

        Modelado PersonajeCho = new Modelado();
        PersonajeCho.setCasa("Ravenclaw");
        PersonajeCho.setGenero("Femenino");
        PersonajeCho.setNombre("Cho Chang");
        PersonajeCho.setBoggart("Ver morir a Cedric");
        PersonajeCho.setPatronus("Cisne");

        Modelado Personajeluna = new Modelado();
        Personajeluna.setCasa("Ravenclaw");
        Personajeluna.setGenero("Femenino");
        Personajeluna.setNombre("Luna Lovegood");
        Personajeluna.setBoggart("La muerte de su madre");
        Personajeluna.setPatronus("Liebre");

        Modelado PersonajeVoldemort = new Modelado();
        PersonajeVoldemort.setCasa("Slytherin");
        PersonajeVoldemort.setGenero("Masculino");
        PersonajeVoldemort.setNombre("Tom Readle");
        PersonajeVoldemort.setBoggart("Su propio cuerpo muerto.");
        PersonajeVoldemort.setPatronus("Serpiente");

        String msg = "Somos personajes principales de la saga Harry Potter: ";
        msg += "\nNombre: " + PersonajeHarryPotter.getNombre();
        msg += "\nCasa: " + PersonajeHarryPotter.getCasa();
        msg += "\nGenero: " + PersonajeHarryPotter.getGenero();
        msg += "\nBoggart: " + PersonajeHarryPotter.getBoggart();
        msg += "\nPatronus: " + PersonajeHarryPotter.getPatronus();
        msg += "\nNombre: " + PersonajeHermione.getNombre();
        msg += "\nCasa: " + PersonajeHermione.getCasa();
        msg += "\nGenero: " + PersonajeHermione.getGenero();
        msg += "\nBoggart: " + PersonajeHermione.getBoggart();
        msg += "\nPatronus: " + PersonajeHermione.getPatronus();
        msg += "\nNombre: " + PersonajeCho.getNombre();
        msg += "\nCasa: " + PersonajeCho.getCasa();
        msg += "\nGenero: " + PersonajeCho.getGenero();
        msg += "\nBoggart: " + PersonajeCho.getBoggart();
        msg += "\nPatronus: " + PersonajeCho.getPatronus();
        msg += "\nNombre: " + Personajeluna.getNombre();
        msg += "\nCasa: " + Personajeluna.getCasa();
        msg += "\nGenero: " + Personajeluna.getGenero();
        msg += "\nBoggart: " + Personajeluna.getBoggart();
        msg += "\nPatronus: " + Personajeluna.getPatronus();
        msg += "\nNombre: " + PersonajeVoldemort.getNombre();
        msg += "\nCasa: " + PersonajeVoldemort.getCasa();
        msg += "\nGenero: " + PersonajeVoldemort.getGenero();
        msg += "\nBoggart: " + PersonajeVoldemort.getBoggart();
        msg += "\nPatronus: " + PersonajeVoldemort.getPatronus();
        System.out.print(msg);
    }
}
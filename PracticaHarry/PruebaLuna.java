package PracticaHarry;

public class PruebaLuna {
    public static void main(String[] args) {
        def();

    }

    // . operador de direccion
    public static void def() {
        Luna Personajeluna = new Luna();
        Personajeluna.setCasa("Ravenclaw");
        Personajeluna.setGenero("Femenino");
        Personajeluna.setNombre("Luna Lovegood");
        Personajeluna.setBoggart("La muerte de su madre");
        Personajeluna.setPatronus("Liebre");

        String msg = "Soy un personaje de la saga Harry Potter: ";
        msg += "\nNombre: " + Personajeluna.getNombre();
        msg += "\nCasa: " + Personajeluna.getCasa();
        msg += "\nGenero: " + Personajeluna.getGenero();
        msg += "\nBoggart: " + Personajeluna.getBoggart();
        msg += "\nPatronus: " + Personajeluna.getPatronus();
        System.out.print(msg);
    }

}

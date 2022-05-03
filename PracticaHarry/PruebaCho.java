package PracticaHarry;

public class PruebaCho {
    public static void main(String[] args) {
        def();

    }

    // . operador de direccion
    public static void def() {
        Cho PersonajeCho = new Cho();
        PersonajeCho.setCasa("Ravenclaw");
        PersonajeCho.setGenero("Femenino");
        PersonajeCho.setNombre("Cho Chang");
        PersonajeCho.setBoggart("Ver morir a Cedric");
        PersonajeCho.setPatronus("Cisne");

        String msg = "Soy un personaje de la saga Harry Potter: ";
        msg += "\nNombre: " + PersonajeCho.getNombre();
        msg += "\nCasa: " + PersonajeCho.getCasa();
        msg += "\nGenero: " + PersonajeCho.getGenero();
        msg += "\nBoggart: " + PersonajeCho.getBoggart();
        msg += "\nPatronus: " + PersonajeCho.getPatronus();

        System.out.print(msg);
    }
}

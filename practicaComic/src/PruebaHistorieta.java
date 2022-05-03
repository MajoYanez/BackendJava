public class PruebaHistorieta {
    public static void main(String[] args) throws InterruptedException {
        Screen screen = new Screen();
        Viñeta viñeta = new Viñeta(
                1,
                "Sara",
                "ADULTHOOD"
        );
        viñeta.uno(screen);
        Thread.sleep(1000);
        viñeta.dos(screen);
        Thread.sleep(1000);
        viñeta.tres(screen);

        Viñeta1 viñeta1 = new Viñeta1(
                2,
                "Sara",
                "I don't want to get up,If I get up,I have to see people and do things... NOOOOO!"
        );
        viñeta1.cuatro(screen);
        Thread.sleep(1000);
        viñeta1.cinco(screen);
        Thread.sleep(1000);
        viñeta1.seis(screen);
        Thread.sleep(1000);
        viñeta1.siete(screen);
        Thread.sleep(1000);

        Viñeta2 viñeta2 = new Viñeta2(
                3,
                "Sara",
                "I should be...."
        );
        viñeta2.ocho(screen);
        Thread.sleep(1000);
        viñeta2.nueve(screen);
        Thread.sleep(1000);
        viñeta2.diez(screen);

        Viñeta3 viñeta3 = new Viñeta3(
                4,
                "Sara",
                "I am"
        );
        viñeta3.once(screen);
        Thread.sleep(1000);
        viñeta3.doce(screen);
        Thread.sleep(1000);
        viñeta3.trece(screen);

        Viñeta4 viñeta4 = new Viñeta4(
                5,
                "Sara",
                "Wrriten Communication"
        );
        viñeta4.catorce(screen);
        Thread.sleep(1000);
        viñeta4.quince(screen);

        Viñeta5 viñeta5 = new Viñeta5(
          6,
          "Sara",
          "Verbal Communication"
        );
        viñeta5.dieciseis(screen);
        Thread.sleep(1000);
        viñeta5.diecisiete(screen);
    }
}

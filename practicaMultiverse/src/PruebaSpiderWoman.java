public class PruebaSpiderWoman {
    public static void main(String[] args) throws InterruptedException {
        Screen screen = new Screen();
        SpiderWoman spiderWoman = new SpiderWoman(
                "Spider Woman",
                "Mujer Araña",
                "Poderes aractidos"
        );
        spiderWoman.fuerza(screen);
        Thread.sleep(1000);
        spiderWoman.fisiologia(screen);
        Thread.sleep(1000);
        spiderWoman.descargasbiolectricas(screen);

        SpiderPunk spiderPunk = new SpiderPunk(
                "Spider Punk",
                "Hombre araña punk",
                "Punk agilidad"
        );
        spiderPunk.agilidad(screen);
        Thread.sleep(1000);
        spiderPunk.velocidad(screen);
        Thread.sleep(1000);
        spiderPunk.reflejos(screen);

        SpiderWolf spiderWolf = new SpiderWolf(
                "Spider Wolf",
                "Hombre Lobo",
                "Licantropo"
        );
        spiderWolf.licantropo(screen);
    }
}

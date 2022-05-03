public class SpiderWoman extends SpiderMan implements SpiderWomanActionCallbacks{

    public SpiderWoman(String name,String description,String power){
        super(name,description,power);
    }

    @Override
    public void fuerza(Screen s) {
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",18,Colors.BlueHorizon);
        s.showImage("fuerza.png");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void fisiologia(Screen s) {
        s.out(showMessage(),"Helvetica",18,Colors.DARK_GRAY);
        s.showImage("fisiologia.png");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void descargasbiolectricas(Screen s) {
        s.out(showMessage(),"Helvetica",18,Colors.PINK);
        s.showImage("biolectricas.png");
        s.setBounds(200,100,1100,900);
    }

}

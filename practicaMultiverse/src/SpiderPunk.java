public class SpiderPunk extends SpiderMan implements  SpiderPunkActionCallbacks{

    public SpiderPunk (String name,String description,String power){
        super(name,description,power);
    }

    @Override
    public void velocidad(Screen s) {
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",18,Colors.BlueHorizon);
        s.showImage("velocidad.png");
        s.setBounds(200,100,1100,900);
    }


    @Override
    public void agilidad(Screen s) {
        s.out(showMessage(),"Helvetica",18,Colors.DARK_GRAY);
        s.showImage("agilidad.png");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void reflejos(Screen s) {
        s.out(showMessage(),"Helvetica",18,Colors.PINK);
        s.showImage("reflejos.png");
        s.setBounds(200,100,1100,900);
    }
}

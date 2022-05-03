public class Viñeta1 extends Historieta implements Viñeta1ActionCallbacks{
    public Viñeta1(int viñeta,String personaje,String narrador){
        super(viñeta,personaje,narrador);
    }


    @Override
    public void cuatro(Screen s) {
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",18,Colors.DARK_GRAY);
        s.showImage("4.png");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void cinco(Screen s) {
        s.out(showMessage(),"Helvetica",18,Colors.DARK_GRAY);
        s.showImage("5.png");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void seis(Screen s) {
        s.out(showMessage(),"Helvetica",18,Colors.DARK_GRAY);
        s.showImage("6.png");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void siete(Screen s) {
        s.out(showMessage(),"Helvetica",18,Colors.DARK_GRAY);
        s.showImage("7.png");
        s.setBounds(200,100,1100,900);
    }

}

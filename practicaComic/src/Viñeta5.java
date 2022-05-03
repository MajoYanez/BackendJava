public class Viñeta5 extends Historieta implements Viñeta5ActionCallbacks {
    public Viñeta5(int viñeta,String personaje,String narrador){
        super(viñeta,personaje,narrador);
    }

    @Override
    public void dieciseis(Screen s) {
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",18,Colors.DARK_GRAY);
        s.showImage("16.png");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void diecisiete(Screen s) {
        s.out(showMessage(),"Helvetica",18,Colors.DARK_GRAY);
        s.showImage("17.png");
        s.setBounds(200,100,1100,900);
    }
}

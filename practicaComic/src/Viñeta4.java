public class Viñeta4 extends Historieta implements Viñeta4ActionCallbacks {
    public Viñeta4(int viñeta,String personaje,String narrador){
        super(viñeta,personaje,narrador);
    }

    @Override
    public void catorce(Screen s) {
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",18,Colors.DARK_GRAY);
        s.showImage("14.png");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void quince(Screen s) {
        s.out(showMessage(),"Helvetica",18,Colors.DARK_GRAY);
        s.showImage("15.png");
        s.setBounds(200,100,1100,900);
    }
}

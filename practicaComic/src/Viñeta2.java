public class Viñeta2 extends Historieta implements Viñeta2ActionCallbacks{
    public Viñeta2(int viñeta,String personaje,String narrador){
        super(viñeta,personaje,narrador);
    }

    @Override
    public void ocho(Screen s) {
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",18,Colors.DARK_GRAY);
        s.showImage("8.png");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void nueve(Screen s) {
        s.out(showMessage(),"Helvetica",18,Colors.DARK_GRAY);
        s.showImage("9.png");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void diez(Screen s) {
        s.out(showMessage(),"Helvetica",18,Colors.DARK_GRAY);
        s.showImage("10.png");
        s.setBounds(200,100,1100,900);
    }
}

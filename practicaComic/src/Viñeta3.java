public class Viñeta3 extends Historieta implements Viñeta3ActionCallbacks{
    public Viñeta3(int viñeta,String personaje,String narrador){
        super(viñeta,personaje,narrador);
    }

    @Override
    public void once(Screen s) {
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",18,Colors.DARK_GRAY);
        s.showImage("11.png");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void doce(Screen s) {
        s.out(showMessage(),"Helvetica",18,Colors.DARK_GRAY);
        s.showImage("12.png");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void trece(Screen s) { s.out(showMessage(),"Helvetica",18,Colors.DARK_GRAY);
        s.showImage("13.png");
        s.setBounds(200,100,1100,900);
    }
}

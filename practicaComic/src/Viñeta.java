public class Viñeta extends Historieta implements ViñetaActionCallbacks {

    public Viñeta(int viñeta,String personaje,String narrador){
        super(viñeta,personaje,narrador);
    }

    @Override
    public void uno(Screen s) {
        s.setVisible(true);
        s.out(showMessage(),"Ebrima",30,Colors.red);
        s.showImage("1.png");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void dos(Screen s) {
        s.out(showMessage(),"Helvetica",28,Colors.BlueHorizon);
        s.showImage("2.png");
        s.setBounds(200,100,1100,900);
    }


    @Override
    public void tres(Screen s) {
        s.out(showMessage(),"Helvetica",28,Colors.BlueHorizon);
        s.showImage("3.png");
        s.setBounds(200,100,1100,900);


    }

    }


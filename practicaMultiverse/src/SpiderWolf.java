public class SpiderWolf extends SpiderMan implements SpiderWolfActionCallbacks{
    public SpiderWolf (String name,String description,String power){
        super(name,description,power);
    }

    @Override
    public void licantropo(Screen s) {
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",18,Colors.BlueHorizon);
        s.showImage("licantropo.png");
        s.setBounds(200,100,1100,900);
    }
}

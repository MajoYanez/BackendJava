public class Historieta {
    private int viñeta;
    private String personaje;
    private String narrador;

    public Historieta(int viñeta, String personaje, String narrador) {
        this.viñeta= viñeta;
        this.personaje = personaje;
        this.narrador= narrador;
    }

    public int getViñeta() {  return viñeta;  }

    public String getPersonaje() {  return personaje;  }

    public String getNarrador() {  return narrador;  }


    public boolean setViñeta(int viñeta) {
        if (viñeta > 0) {
            this.viñeta = viñeta;
            return true;
        } else
            return false;
    }

    public boolean setPersonaje(String personaje){
        if(!personaje.isEmpty()){
            this.personaje = personaje;
            return true;
        }else
            return false;
    }

    public boolean setNarrador(String narrador) {
        if (!narrador.isEmpty()) {
            this.narrador = narrador;
            return true;
        } else
            return false;
    }

    public String showMessage(){
        return
                "\nviñeta: "+viñeta+
                        "\npersonaje: "+personaje+
                        "\nnarrador: "+narrador+"\n";

    }
}

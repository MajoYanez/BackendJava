package PracticaHarry;

public class HarryPotter {
    //Caracteristicas - Campos -MODELANDO UN OBJETO (HarryPotter)
    public String casa,genero,nombre,boggart,patronus;

    public String getCasa() {  return casa;  }
    public String getGenero() {  return genero;  }
    public String getNombre () {  return nombre;  }
    public String getBoggart() {  return boggart;  }
    public String getPatronus() {  return patronus;  }

    public boolean setCasa (String casa){
        if(!casa.isEmpty()){
            this.casa = casa;
            return true;

        }else
            return false;
    }
    public boolean setGenero (String genero){
        if(!casa.isEmpty()){
            this.genero = genero;
            return true;

        }else
            return false;
    }
    public boolean setNombre (String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;

        }else
            return false;
    }
    public boolean setBoggart (String boggart){
        if(!boggart.isEmpty()){
            this.boggart = boggart;
            return true;

        }else
            return false;
    }
    public boolean setPatronus (String patronus){
        if(!patronus.isEmpty()){
            this.patronus = patronus;
            return true;

        }else
            return false;
    }
    public String printState(){
        return "casa: "+casa+"\n"+
                "genero: "+genero+"\n"+
                "nombre: "+nombre+"\n"+
                "boggart: "+boggart+"\n"+
                "patronus: "+patronus;
    }
}



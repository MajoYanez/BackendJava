public class SpiderMan {
    private String name;
    private String description;
    private String power;

    public SpiderMan(String name,String description,String power) {
        this.name = name;
        this.description = description;
        this.power = power;
    }

    public String getName () {  return name;  }
    public String getDescription () {  return description;  }
    public String getPower ()  {  return  power;  }

    public boolean setName(String Name){
        if(!name.isEmpty()){
            this.name = name;
            return true;
        }else
            return false;
    }

    public boolean setDescription(String Description){
        if(!description.isEmpty()){
            this.description = description;
            return true;
        }else
            return false;
    }

    public boolean setPower(String Power){
        if(!power.isEmpty()){
            this.power = power;
            return true;
        }else
            return false;
    }

    public String showMessage(){
        return
                "\nName: "+name+
                        "\nDescription: "+description+
                        "\nPower: "+power+"\n";
    }

}


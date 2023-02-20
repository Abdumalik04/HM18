public abstract class Family implements PlataKom {
    private String name;
    private int dengi;


    public Family(String name,int dengi) {
       this. name = name;
      this. dengi=dengi;
    }

    public String getname() {
        return name;
    }

    public void setFullname(String name) {
      name = name;
    }


    public int getDengi() {
        return dengi;
    }

    public void setDengi(int dengi) {
        this.dengi = dengi;
    }

    @Override
    public String toString() {
        return "Family" +
                "Fullname:" + name +
                ", dengi:" + dengi ;
    }

    @Override
    public int hotel() {
      return (dengi*2)*3;
    }

    @Override
    public int house() {
return dengi*5;
    }

    @Override
    public int batir() {
return dengi*3;
    }
}

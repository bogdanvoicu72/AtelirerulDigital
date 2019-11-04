package lab2;

public class Actor {
    private String name;
    private Integer varsta;
    private Premiu []  premii;
    public Actor(String name, Integer varsta, Premiu[] premii){
        this.name=name;
        this.varsta=varsta;
        this.premii=premii;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public Premiu[] getPremii() {
        return premii;
    }

    public void setPremii(Premiu[] premii) {
        this.premii = premii;
    }
    public String toString(){
        return name + " " + varsta + " " + premii;
    }
    public String  getNume(){
        return name;
    }
}

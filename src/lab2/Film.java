package lab2;

public class Film {
    private Integer anAparitie;
    private String name;
    private Actor [] actori;
    public Film( Integer anAparitie, String name, Actor[]  actori){
        this.anAparitie=anAparitie;
        this.name=name;
        this.actori=actori;
    }

    public Integer getAnAparitie() {
        return anAparitie;
    }

    public void setAnAparitie(Integer anAparitie) {
        this.anAparitie = anAparitie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Actor[] getActori() {
        return actori;
    }

    public void setActori(Actor[] actori) {
        this.actori = actori;
    }
    public String toString(){
        return anAparitie + " " + name + " " + actori;
    }
    public Actor getActorByName(String name){
        for(int i=0; i<actori.length; i++){
            if(actori[i].getNume().equals(name))
            {
                return actori[i];
            }
        }
        return null;

    }
}

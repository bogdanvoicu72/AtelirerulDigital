
public abstract class Cocktail {
    private String Descriere;
    private int Costul;
    public Cocktail(String Descriere , int Costul)
    {
        this.Descriere=Descriere;
        this.Costul=Costul;
    }

    public String getDescriere() {
        return Descriere;
    }

    public int getCostul() {
        return Costul;
    }
}

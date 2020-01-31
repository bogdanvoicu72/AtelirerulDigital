public class Reteta extends Cocktail {
    private Cocktail cocktail;
    public Reteta(String Descriere, int Costul, Cocktail cocktail )
    {
        super(Descriere,Costul);
        this.cocktail=cocktail;
    }

    @Override
    public String getDescriere() {
        return cocktail.getDescriere()+ " "+super.getDescriere();
    }

    @Override
    public int getCostul() {
        return super.getCostul() + cocktail.getCostul();
    }
}

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> condi = new ArrayList<>();
        list.add("Mojito - 18");
        list.add("Long Island - 21 LEI");
        list.add("Bloody Mary - 20 LEI");
        list.add("Aperol Spritz - 25 LEI");
        condi.add("Menta - 2 LEI");
        condi.add("Spicy - 5 LEI");
        condi.add("Lime - 2 LEI");
        Scanner input = new Scanner(System.in);
        System.out.println("Bine ati venit la COCK!");
        System.out.println("Lista cu produsele noaste!");
        System.out.print("Si lista cu ce se poate pune extra!");
        System.out.println(list + " " + condi);
        System.out.println("Numele va rog!");
        String nume = input.nextLine();
        System.out.println("Buna ziua "+nume);
        System.out.println("Cu ce va putem servi?");
        Scanner input1 = new Scanner(System.in);
        String bautura = input1.nextLine();
        if(bautura.equals("Aperol Spritz")) {
            Cocktail cocktail = new Aperol_Spritz();
            Cocktail spicy = new Spicy(cocktail);
            Cocktail lime = new Lime(spicy);
            System.out.println("Descrierea produsului: " + lime.getDescriere() + " " + "Pretul produsului este de: " + lime.getCostul() + " lei.");

        }
        if(bautura.equals("Mojito")){
            Cocktail cocktail = new Mojito();
            Cocktail lime = new Lime(cocktail);
            System.out.println("Descrierea produsului: " + lime.getDescriere() + " " + "Pretul produsului este de: " + lime.getCostul() + " lei.");

        }

    }
}

package lab2;

public class Main {
    public static  void main(String []  args){
        Fighter f1 = new Fighter("Vadim", 300, 250);
        System.out.println(f1);
        Fighter f2 = new Fighter("Grasu", 50000, 2);
        BoxingMatch boxingMatch = new BoxingMatch(f1,f2);
       System.out.println( boxingMatch.fight());
       System.out.println(f2);
       System.out.println(Fighter.getNumbersOfFighters());
    }
}

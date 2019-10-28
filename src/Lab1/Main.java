package Lab1;
import java.util.Scanner;
public class Main {
    void fizzBuzz(){
        int i=1;
        for(i=1; i<=100; i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if (i%5==0){
                System.out.println("Buzz");
            }
            else if ( i%3==0)
            {
                System.out.println("Fizz");
            }
            else if(i%7==0){
                System.out.println("Rizz");
            }
            else if(i%9==0){
                System.out.println("Jazz");
            }
            else System.out.println(i);
        }
    }
    public static void main (String []  args){
       Main a = new Main();
        a.fizzBuzz();
    }
}

package NEW.FunctionalPart;

import java.util.Scanner;

public class Division {
    Scanner scanner = new Scanner(System.in);

    public static double division (double a, double b){

        if (a == 0){
            System.out.println("0 делить нельзя");

            if (b == 0){
                System.out.println("На 0 делить нельзя");  //Эта часть почему-то не работает
            }
        }
        return a / b;

    }
}

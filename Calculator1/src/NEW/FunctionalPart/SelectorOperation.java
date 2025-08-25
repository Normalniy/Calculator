package NEW.FunctionalPart;

public class SelectorOperation {
    public static double operation (int operation, double num1, double num2) {

        String A = "Попробуй ещё раз";
        switch (operation) {
        case 1:
            return Addition.addition(num1, num2);
        case 2:
            return Subtraction.substraction(num1, num2);
        case 3:
            return Multiplication.multiplication(num1, num2);
        case 4:
            return Division.division(num1, num2);
        default:
            System.out.println("Error");    //Нужно вернуть именно Duoble, поэтому придётся выводить хоть какое-то число.
            return 404;
    }
}

}

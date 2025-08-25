package NEW;

import NEW.FunctionalPart.Addition;
import NEW.FunctionalPart.Division;
import NEW.FunctionalPart.Multiplication;
import NEW.FunctionalPart.Subtraction;
import NEW.FunctionalPart.SelectorOperation;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        while (true) { // Начало цикла

            System.out.println("Введите первое число");
            double num1 = scanner.nextDouble();
            System.out.println("Введите второе число");
            double num2 = scanner.nextDouble();

            System.out.println("Выбор операции");
            System.out.println("1 - для сложения");
            System.out.println("2 - для вычитания");
            System.out.println("3 - для умножения");
            System.out.println("4 - для деления");

            int operation = scanner.nextInt();   // Число для выбора операции


            double result = SelectorOperation.operation(operation, num1, num2); /* Закидываем все числа в класс выбора операции.
                                                        SelectorOperation принимает все числа. Считает и выбирает опервцию*/


            System.out.println("Результат - " + result);

            System.out.println("Выполнить ещё одну оперцию?");
            System.out.println("1 - да ");
            System.out.println("2 - Нет");

            int oneMore = scanner.nextInt();
            if (oneMore != 1){
                System.out.println("Работа завершена");
                break; //Тут цикл заканчивается. по сути Просто пишется начало while (true) { и в конце break; }
            }


        }
        }

    }


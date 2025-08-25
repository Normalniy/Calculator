package OLD;

import java.util.Scanner;

public class Calculator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.println("Введите первое число ");
            double number1 = scanner.nextDouble();

            System.out.println("Введите второе число");
            double number2 = scanner.nextDouble();

            System.out.println("Введите число");
            System.out.println("1 для сложения");
            System.out.println("2 вычитания");
            System.out.println("3 умножения");
            System.out.println("4 деления");
            double operation = scanner.nextDouble();

            System.out.println("Результат ");
            if (operation == 1) { System.out.println(number1 + number2);
            }

            if (operation == 2) { System.out.println(number1 - number2);
            }

            if (operation == 3) { System.out.println(number1 * number2);
            }

            if (operation == 4) { System.out.println(number1 / number2);
            }

            if (operation > 4){System.out.println("Ошибка! Операции не существует");
            }
            if (operation < 1){System.out.println("Ошибка! Операции не существует");
            }

        }
    }


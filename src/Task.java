import java.util.Scanner;
import java.util.Arrays;

/**
 * Калькулятор и поиск длинного слова в массиве.
 * @author Dmitry Makhinya IBS Appline
 * @see Math#sum(double, double) осуществляет сложение дробных чисел, которые были введены изначально
 * @see Math#diff(double, double) осуществляет вычитание дробных чисел
 * @see Math#mult(double, double) осуществляет умножение дробных чисел
 * @see Math#div(double, double) осуществляет деление дробных чисел
 * @see Sort#getMax(String) в этот метод передаётся готовая введёная строка, и в ней выполняется поиск самого длинного слова
 */
public class Task {
    public static void main(String[] args) {
        System.out.println("Выберите операцию: 1 - запуск калькулятора, 2 - поиск максимального слова в массиве");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число, соответствующие операции: ");
        int a = input.nextInt();
        if (a == 1) {
            System.out.println("Выбрана операция 'запуск калькулятора'");
            System.out.println("Выберите операцию: ('+', '-', '*', '/')");
            String f = input.next();
            System.out.println("Введите первое дробное число: ");
            double g = input.nextDouble();
            System.out.println("Введите второе дробное число: ");
            double h = input.nextDouble();
            switch (f){
                case "+": Math.sum(g,h);
                    break;
                case "-": Math.diff(g,h);
                    break;
                case "*": Math.mult(g,h);
                    break;
                case "/": Math.div(g,h);
                    break;
                default:
                    System.out.println("Нет такой операции!");
            }
        }else if (a == 2) {
            System.out.println("Выбрана операция 'поиск максимального слова в массиве'");
            System.out.println("Введите размер массива: ");
            int size = input.nextInt();
            String array[] = new String[size];
            System.out.println("Введите элемент массива:");
            for (int i = 0; i < size; i++) {
                array[i] = input.next();
            }
            String joinedString = Arrays.toString(array);
            joinedString = joinedString.replaceAll("[^A-Za-zА-Яа-я0-9]", " ");
            Sort.getMax(joinedString);
        }else{
            System.out.println("Нет такого номера операции!");
        }
    }
}

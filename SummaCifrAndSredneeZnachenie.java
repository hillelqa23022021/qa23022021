import java.util.Scanner;

public class SummaCifrAndSredneeZnachenie {
    public static void main(String[] args) {
        System.out.println("Введите 5 любых цифр от 0 до 9: ");

//Слово «цифра» происходит от арабского «сифр», что означает «ноль». 
//Цифры — это знаки для записи чисел. 
//Обычно цифра означает один из следующих графических знаков: 0 1 2 3 4 5 6 7 8 9. 
//Это так называемые арабские цифры.

        Scanner input = new Scanner(System.in);
        double a, b, c, d, f, g;
        System.out.println("Ввделите цифру a =");
        a = input.nextDouble();
        System.out.println("Ввделите цифру b =");
        b = input.nextDouble();
        System.out.println("Ввделите цифру c =");
        c = input.nextDouble();
        System.out.println("Ввделите цифру d =");
        d = input.nextDouble();
        System.out.println("Ввделите цифру f =");
        f = input.nextDouble();
        System.out.println(a + b + c + d + f);

        g = (a + b + c + d + f) / 5;
        System.out.println("Среднее значение = " + g);

    }
}

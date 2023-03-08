import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj zakres losowania liczb");
        int a = inputIn();
        int b = inputIn();

        if(a<b) {
            System.out.println("Liczba a nie moze byc mniejsze od b");
        }
        else {
            System.out.println("Zad 1.");
            System.out.println(Name() + " " + Wiek());

            System.out.println("\nZad 2.");
            Dzialania(losuj(a, b), losuj(a, b));

            System.out.println("\nZad 3.");
            int c = losuj(a, b);
            if (parzysta(c)) {
                System.out.println("Liczba " + c + " jest parzysta");
            } else {
                System.out.println("Liczba " + c + " nie jest parzysta");
            }

            System.out.println("\nZad 4.");
            int d = losuj(a, b);
            if (podzielna(d)) {
                System.out.println("liczba " + d + " jest podzielna przez 3 i 5");
            } else {
                System.out.println("Lcizba " + d + " nie jest podzielna przez 3 i 5");
            }

            System.out.println("\nZad 5.");
            int e = losuj(a, b);
            System.out.println("Liczba " + e + " podniesiona do potęgi 3 wynosi: " + potega(e));

            System.out.println("\nZad 6.");
            int f = losuj(a, b);
            System.out.println("Pierwiastek kwadratowy z liczby " + f + " wynosi: " + pierwiastek(f));

            System.out.println("\nZad 7.");
            int l1 = inputIn();
            int l2 = inputIn();

            int x = losuj(l1, l2), y = losuj(l1, l2), z = losuj(l1, l2);

            System.out.println(x);
            System.out.println(y);
            System.out.println(z);

            if (trojkat(x, y, z)) {
                System.out.println("Można");
            } else {
                System.out.println("Nie można");
            }
        }
    }

    //    zad 1.
    public static String Name() {
        return "Nikodem";
    }
    public static int Wiek() {
        return 21;
    }

    //    zad 2
    public static void Dzialania(int a, int b) {
        System.out.println("Suma\t" + a + " + " + b + " = " + (a + b));
        System.out.format("Różnica\t%d - %d = %d\n", a, b, (a - b));
        System.out.format("Iloczyn\t%d * %d = %d\n", a, b, (a * b));
    }

    //    zad 3
    public static boolean parzysta(int a) {
        if (a % 2 == 0) {
            return true;
        }
        return false;
    }

    //    zad 4
    public static boolean podzielna(int a) {
        if(a%3==0 && a%5==0) {
            return true;
        }
        return false;
    }

    //    zad 5
    public static double potega(int a) {
        return Math.pow(a,3);
    }

    //    zad 6
    public static double pierwiastek(int a) {
        return Math.sqrt(a);
    }

    //    zad 7
    public static boolean trojkat(int a, int b, int c) {
        if ((Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) || (Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)) || (Math.pow(c, 2) + Math.pow(b, 2) == Math.pow(a, 2))) {
            return true;
        }
        return false;
    }

    //   pomocnicze
    public static int inputIn() {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        return input.nextInt();
    }

    public static int losuj(int a, int b) {
        Random rand = new Random();
        return rand.nextInt(b - a + 1) + a;
    }
}
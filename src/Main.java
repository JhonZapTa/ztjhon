import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num = sc.nextInt();
        System.out.println("El triple del número " + num + " es: " + tripleDelNum(num));
        System.out.println("La mitad del número " + num + " es: " + mitadDelNum(num));
        System.out.println("El número es par: " + esPar(num));
        System.out.println("Es positivo: " + esPositivo(num));
        System.out.println("Hola mundo de nuevo");
        for (int i = 0; i < 3; i++) {
            System.out.println("Hola ¿Cómo estas?");
        }
    }
    public static int tripleDelNum (int num) {
        return num * 3;
    }
    public static double mitadDelNum (int num) {
        return num / 2;
    }
    public static boolean esPar (int num) {
        return num % 2 == 0;
    }
    public static boolean esPositivo (int num) {
        return num > 0;
    }
}

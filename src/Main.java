import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num = sc.nextInt();
        System.out.println("Introduce tu edad: ");
        int num2 = sc.nextInt();
        System.out.println("El triple del número " + num + " es: " + tripleDelNum(num));
        System.out.println("La mitad del número " + num + " es: " + mitadDelNum(num));
        System.out.println("Es mayor de edad: " + esMayorEdad(num2));
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
    public static boolean esMayorEdad (int num2) {
        return num2 >= 18;
    }
}

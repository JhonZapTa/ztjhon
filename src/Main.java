import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num = sc.nextInt();
        System.out.println("El triple del número " + num + " es: " + tripleDelNum(num));
        System.out.println("Hola mundo de nuevo");
        for (int i = 0; i < 3; i++) {
            System.out.println("Hola ¿Cómo estas?");
        }
    }
    public static int tripleDelNum (int num) {
        return num * 3;
    }
}

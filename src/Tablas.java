import java.util.Scanner;

public class Tablas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numero de la tabla: ");
        int valor = sc.nextInt();
        int contador = 0;
        int resultado = 1;

        while (contador <= 12) {
            resultado = valor * contador;
            System.out.println("" + valor + "x" + contador + "=" + resultado);
            contador += 1;

        }



    }
}

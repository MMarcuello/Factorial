import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce valor: ");
        int valor = sc.nextInt();
        int contador = 1;
        int resultado = 1;

        while (contador<= valor){
            resultado = resultado * contador;
            contador+=1;

        }

        System.out.println("El resultado es: " + resultado);


        // write your code here
    }

}

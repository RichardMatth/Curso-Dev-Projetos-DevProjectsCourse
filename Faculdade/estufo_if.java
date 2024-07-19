import java.util.Scanner;

public class Menor {
    public static void main(String[] args) {
    int num1, num2;
    
      Scanner teclado = new Scanner(System.in);
    
    System.out.print("Digite um valor inteiro: ");
    num1 = teclado.nextInt();
    
    System.out.print("Digite outro valor inteiro: ");
    num2 = teclado.nextInt();
    
    if (num1 < num2) {
    System.out.println(num1 + "eh menor que " + num2);
    }
    
    System.out.printf("Fim do programa.");

  } //fim main
} //fim main

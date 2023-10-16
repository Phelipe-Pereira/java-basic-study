import java.util.Scanner;

public class EstruturaRepeticao {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = -1;
        while (numero != 10) { 
// enquanto a variável não for 10, o trecho de código será repetido
            System.out.println("Digite um número: ");
            numero = scanner.nextInt();
            if (numero == 10) {
                System.out.println("Você acertou!");
            } else {
                System.out.println("Você errou.");
            }
        }
    }
								   
}
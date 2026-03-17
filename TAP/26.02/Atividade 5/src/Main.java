import java.util.Scanner;
//Usando do-while peça para o usuário digitar um número até que ele digite 0.
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1;

        do {
            System.out.println("Digite um numero: ");
            n1 = sc.nextInt();
        } while (n1 != 0);
    }
}
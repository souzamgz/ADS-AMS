/*
1 - Escreva um programa que declare dois números inteiros e exiba:
• A soma
• A subtração
• A multiplicação
• A divisão
• O resto da divisão
*/

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1, n2, resultado = 0, resto = 0;
    int opcao;

    System.out.print("Digite um número: ");
    n1 = sc.nextInt();
    System.out.print("Digite outro número: ");
    n2 = sc.nextInt();

    System.out.println("Escolha sua opção:");
    System.out.println("Soma [1]");
    System.out.println("Subtração [2]");
    System.out.println("Multiplicação [3]");
    System.out.println("Divisão [4]");
    opcao = sc.nextInt();

    switch (opcao) {
      case 1:
        resultado = n1 + n2;
        System.out.println("Resultado da soma dos dois numeros: " + resultado);
        break;
      case 2:
        resultado = n1 - n2;
        System.out.println("Resultado da sub dos dois numeros: " + resultado);
        break;
      case 3:
        resultado = n1 * n2;
        System.out.println("Resultado da mult dos dois numeros: " + resultado);
        break;
      case 4:
        if (n2 != 0) {
          resultado = n1 / n2;
          resto = n1 % n2;
          System.out.println("Resultado da div dos dois numeros: " + resultado);
          System.out.println("Resto da div: " + resto);
        } else {
          System.out.println("Erro: divisão por zero!");
        }
        break;
      default:
        System.out.println("Opção inválida!");
    }

    sc.close();
  }
}


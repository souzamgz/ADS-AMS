/*
1 - Crie uma classe Calculadora que possua métodos sobrecarregados chamados
multiplicar, atendendo aos seguintes cenários:
✓ Dois números inteiros
✓ Dois números reais
✓ Três números inteiros
✓ Três números reais
• Crie uma classe Main para testar todos os métodos.
 */
public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.mult(1, 2));
        System.out.println(calculadora.mult(1.5, 2.5));
        System.out.println(calculadora.mult(1,2,3));
        System.out.println(calculadora.mult(1.5, 2.5, 3.5));

    }
}

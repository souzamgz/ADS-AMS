/*
• 1 - Crie uma classe Calculadora com:
✓ método static com a seguinte assinatura: somar(Integer a, Integer b)
✓ método static com a seguinte assinatura: multiplicar(Integer a, Integer b)
• No main, utilize os métodos sem instanciar a classe.
 */
public class Main {
    public static void main(String[] args) {

        Integer s = Calculadora.somar(1, 2);
        Integer m = Calculadora.mult(1, 2);

        System.out.println(s);
        System.out.println(m);

    }
}
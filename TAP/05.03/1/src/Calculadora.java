/*
1 - Crie uma classe Calculadora que possua métodos sobrecarregados chamados
multiplicar, atendendo aos seguintes cenários:
✓ Dois números inteiros
✓ Dois números reais
✓ Três números inteiros
✓ Três números reais
• Crie uma classe Main para testar todos os métodos.
 */

public class Calculadora {
    public Integer mult (Integer a, Integer b){
        return a*b;
    }

    public double mult (Double a, Double b){
        return a*b;
    }

    public Integer mult (Integer a, Integer b, Integer c){
        return a*b*c;
    }

    public double mult (Double a, Double b, Double c){
        return a*b*c;
    }
}

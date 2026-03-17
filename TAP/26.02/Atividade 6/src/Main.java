/*6 - Crie uma classe chamada Carro com os atributos marca, ano, ligado (boolean).
Crie também os seguintes métodos:
✓ ligar() → muda ligado para true
✓ desligar() → muda ligado para false
✓ No main:
✓ Crie um objeto
✓ Ligue o carro
✓ Mostre se ele está ligado

 */

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.ligar();
        carro.ligar();
        System.out.println(carro.ligado);

    }
}
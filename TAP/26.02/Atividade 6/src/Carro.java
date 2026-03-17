/*6 - Crie uma classe chamada Carro com os atributos marca, ano, ligado (boolean).
Crie também os seguintes métodos:
✓ ligar() → muda ligado para true
✓ desligar() → muda ligado para false
✓ No main:
✓ Crie um objeto
✓ Ligue o carro
✓ Mostre se ele está ligado

 */

public class Carro  {
    String marca;
    int ano;
    boolean ligado = false;

    public void ligar(){
        if (ligado = true){
            ligado = false;
            System.out.println("O carro está Desligado");

        }else {
            ligado = true;
            System.out.println("O carro está Ligado");
        }
    }



}

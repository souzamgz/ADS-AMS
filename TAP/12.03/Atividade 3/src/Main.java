/*
• 3 - Crie uma classe Carro com:
✓ atributos modelo e ano
• No main:
✓ crie um objeto carro1
✓ atribua carro2 = carro1
✓ altere o modelo usando carro2
✓ imprima os dados usando carro1
✓ Explique o que aconteceu. (pode ser um linha de comentário)

 */
public class Main {
    public static void main(String[] args) {
    Carro c1 = new Carro();
    Carro c2 = new Carro();
    c2 = c1;
    c2.setModelo("Gol");
    c2.setAno(2009);
        System.out.println(c1.getModelo());
        System.out.println(c1.getAno());
    //Nao funcionou pois eu igualei o c2 ao c1, mas depois alterei os elementos apenas do c2, entao o c1 continua o mesmo.




    }
}
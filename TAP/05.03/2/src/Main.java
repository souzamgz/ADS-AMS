import java.sql.SQLOutput;

/*
2 - Crie uma classe Conversor com métodos sobrecarregados chamados converter:
✓ Recebe um valor double e retorna o valor convertido para int
✓ Recebe um valor int e retorna o valor convertido para double
• Teste as conversões no metodo main
 */
public class Main {
    public static void main(String[] args) {
        Conversor conversor = new Conversor();
        System.out.println(conversor.converter(1.5));
        System.out.println(conversor.converter(3));
    }
}
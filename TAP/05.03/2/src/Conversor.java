/*
2 - Crie uma classe Conversor com métodos sobrecarregados chamados converter:
✓ Recebe um valor double e retorna o valor convertido para int
✓ Recebe um valor int e retorna o valor convertido para double
• Teste as conversões no metodo main
 */

public class Conversor {
   public double converter(Integer a){
       return a;
   }

   public Integer converter(Double b){
      return b.intValue();
   }
}

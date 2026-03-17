/*
• 4 - Crie uma classe Funcionario com os atributos nome e salario e com o método
exibirDados(). Crie duas classes que herdam de Funcionario: Gerente e
Programador.
✓ Na classe Programador, crie um método programar().
✓ Na classe Gerente, crie um método realizarReuniao().
✓ No main, instancie objetos das duas classes e utilize o método herdado e também seus
métodos específicos.
 */
public class Main {
    public static void main(String[] args) {
   Gerente g = new Gerente();
   Programador p = new Programador();
   Funcionario f = new Funcionario();
   g.exibirDados("Ana", "13400");
   g.realizarReuniao();
   p.exibirDados("Geraldo", "4000");
   p.programar();


/*
• 5 - Mantendo a estrutura de classes do exercício anterior, sobrescreva o método
toString() na classe Funcionario para retornar:
✓ Nome: X | Salário:Y
• Depois:
✓ Imprima diretamente o objeto usando System.out.println(funcionario);
 */

        System.out.println(f);
    }
}
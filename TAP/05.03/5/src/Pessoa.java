/*
5 - Crie uma classe Pessoa com:
✓ nome (String)
✓ idade (Integer)
• Implemente um construtor que receba nome e idade como parâmetros e inicialize os
atributos.
• No main, crie ao menos dois objetos usando esse construtor.
 */

public class Pessoa {

    String nome;
    Integer idade;

     Pessoa(String nome, Integer idade){this.nome = nome;
        this.idade = idade;

        System.out.println("Criando o" + nome + " com a idade " + idade);
    }


}

/*
• 7 - Crie uma classe Livro com:
✓ titulo (String)
✓ autor (String)
✓ anoPublicacao (Integer)
• Implemente os seguintes construtores:
✓ Construtor padrão
✓ Construtor que recebe apenas o título
✓ Construtor que recebe título e autor
✓ Construtor que recebe todos os atributos
• Teste todas as formas de instanciação no main.
 */

public class Livro {
    String t;
    String a;
    Integer anop;

    public Livro(){

    }

    public Livro(String t){
        this.t = t;

    }

    public Livro(String t, String a){
        this.t = t;
        this.a = a;

    }

    public Livro(String t, String a, Integer anop){
        this.t = t;
        this.a = a;
        this.anop = anop;
    }
}

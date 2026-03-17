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

public class Main {
    public static void main(String[] args) {
    Livro livro1 = new Livro();
    Livro livro2 = new Livro("Star wars");
    Livro livro3 = new Livro("Star wars", "George Lucas");
    Livro livro4 = new Livro("Star wars", "Gerge Lucas", 1977);
    }
}
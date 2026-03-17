/*
3 - Crie uma classe Produto com os seguintes atributos privados:
✓ nome (String)
✓ preco (double)
• Implemente:
✓ Getters e setters para todos os atributos
✓ Um setter para preco que não permita valores negativos
• Crie uma classe Main para testar.
 */

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Pão");
        produto.setPreco(2);
        System.out.println(produto.getNome());
        System.out.println(produto.getPreco() + " Reais");

    }
}
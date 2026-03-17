/*
3 - Crie uma classe Produto com os seguintes atributos privados:
✓ nome (String)
✓ preco (double)
• Implemente:
✓ Getters e setters para todos os atributos
✓ Um setter para preco que não permita valores negativos
• Crie uma classe Main para testar.
 */

public class Produto {
    private String nome;
    private int preco;

    public String getNome(){
        return nome;

    }
    public int getPreco(){
        return preco;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(int preco) {
        if (preco > 0) {
            this.preco = preco;
        }else {
            System.out.println("Não existe preço 0 ou abaixo");
        }
        }
}

/*
• 2 - Crie uma classe Produto com os seguintes atributos: nome, preco e um atributo
static chamado quantidadeProdutos. Crie um construtor que incremente em um
quantidadeProdutos a cada nova instância criada. No método main instancie 3
produtos e em seguida imprima o valor de Produto.quantidadeProdutos.
 */
public class Produto {
    String nome;
    Integer preco;

    public static int qp = 0;

    public Produto(String nome, Integer preco){
        this.nome = nome;
        this.preco = preco;
        qp++;

    }
}

/*
• 2 - Crie uma classe Produto com os seguintes atributos: nome, preco e um atributo
static chamado quantidadeProdutos. Crie um construtor que incremente em um
quantidadeProdutos a cada nova instância criada. No método main instancie 3
produtos e em seguida imprima o valor de Produto.quantidadeProdutos.
 */
void main() {
Produto p1 = new Produto("Agua", 1);
Produto p2 = new Produto("Pao", 2);
Produto p3 = new Produto("Carne", 3);
Produto p4 = new Produto("Arroz", 5);
    System.out.println("Produtos criados: " + Produto.qp);
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    System.out.println(p4);
}


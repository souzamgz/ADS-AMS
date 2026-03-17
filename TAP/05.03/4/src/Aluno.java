/*
4 - Crie uma classe Aluno com:
✓ nome (String)
✓ nota (double)
• Implemente getters e setters, sendo que:
✓ O setter da nota só aceita valores entre 0 e 10
✓ Caso o valor seja inválido, a nota não deve ser alterada
 */

public class Aluno {
    private String nome;
    private double nota;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota >= 0 || nota <=10) {
            this.nota = nota;
        }else {
            System.out.println("Não são aceitos valores abaixo de 0 ou acima de 10! ");
        }
    }
}

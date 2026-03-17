/*
4 - Crie uma classe Aluno com:
✓ nome (String)
✓ nota (double)
• Implemente getters e setters, sendo que:
✓ O setter da nota só aceita valores entre 0 e 10
✓ Caso o valor seja inválido, a nota não deve ser alterada
 */
public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Francisco");
        aluno.setNota(10);
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Nota: " + aluno.getNota());
    }
}
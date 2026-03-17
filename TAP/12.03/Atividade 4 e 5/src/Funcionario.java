
public class Funcionario {
    String nome = "X ";
    String salario = "Y ";


    public void exibirDados(String nome, String salario){
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nome " + nome + "Salario " + salario;
    }
}

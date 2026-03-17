/*
• 9 - Crie uma classe Funcionario com:
✓ nome (String), cargo (String), salario (double)
• Implemente:
✓ Encapsulamento completo (getters e setters)
✓ Um setter de salário que não permita valor menor ou igual a zero
✓ Sobrecarga de construtores:
o Construtor padrão
o Construtor com nome e cargo
o Construtor com nome, cargo e salário
• Crie uma classe Main que instancie objetos usando todos os construtores e exiba os dados
no console.
 */

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0){
            this.salario = salario;
        }else {
            System.out.println("Salário não pode ser 0 ou menor");
        }

    }

    public Funcionario(){

    }

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

}

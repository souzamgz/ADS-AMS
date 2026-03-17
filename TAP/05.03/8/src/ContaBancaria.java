/*
8 - Crie uma classe ContaBancaria com:
✓ numeroConta (String), titular (String), saldo (double)
• Requisitos:
✓ Todos os atributos devem ser private
✓ Criar getters e setters
✓ Criar os seguintes construtores: Construtor padrão, Construtor com número da conta e
titular, Construtor com número da conta, titular e saldo inicial
 */

public class ContaBancaria {
    private String nC;
    private String t;
    private double s;

    public String getnC() {
        return nC;
    }

    public void setnC(String nC) {
        this.nC = nC;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    public ContaBancaria(){

    }

    public ContaBancaria(String nC, String t){
        this.nC = nC;
        this.t = t;

    }
    public ContaBancaria(String nC, String t, Double s){
        this.nC = nC;
        this.t = t;
        this.s = s;
        
    }
}

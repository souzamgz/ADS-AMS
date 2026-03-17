/*
• 3 - Crie uma classe Carro com:
✓ atributos modelo e ano
• No main:
✓ crie um objeto carro1
✓ atribua carro2 = carro1
✓ altere o modelo usando carro2
✓ imprima os dados usando carro1
✓ Explique o que aconteceu. (pode ser um linha de comentário)

 */
public class Carro {
    private String modelo = "uno";
    private Integer ano = 2008;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
}

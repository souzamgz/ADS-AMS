/*
6 - Crie uma classe Usuário com:
✓ login (String)
✓ senha (String)
• Implemente um construtor que:
✓ Receba login e senha
✓ Exiba no console uma mensagem indicando que o usuário foi criado
 */

public class Usuario {
    String login;
    String senha;

    Usuario(String login, String senha){
        this.login = login;
        this.senha = senha;
        System.out.println("O usuário: '" + login + "' Com a senha: '" + senha + "' foi criado com sucesso" );

    }
}

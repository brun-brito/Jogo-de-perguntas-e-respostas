import java.io.Serializable;

public class Admin extends Usuario implements Serializable {
    private String senha;                                  //Atributo senha
    public Admin(String nome, String senha) {              //Construtor da classe Adm, utilizando o atributo nome da classe Usuário
        super(nome);
        setSenha(senha);
    }

    public String getSenha() {                      //metódo get do atributo senha
        return senha;
    }

    public void setSenha(String senha) {                //metódo set do atributo senha
        this.senha = senha;
    }

    @Override
    public void cadastrarUser(Usuario user, Jogo jogo) {        //sobreposição do método cadastraUser
        jogo.setAdmin(user);
    }

    public static void excluiUser(Usuario u, Jogo jogo) {          //método para excluir usuário, passando como parâmetro usuário e jogo
    }

    public boolean realizarLogin(String nome, String senha) {           // método para login, passando como parâmetro o nome e a senha do admin.
        return this.getNome().equals(nome) && this.senha.equals(senha);
    }
}

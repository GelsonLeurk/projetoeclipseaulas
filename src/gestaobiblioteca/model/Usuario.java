package gestaobiblioteca.model;

public abstract class Usuario implements Autenticavel {
    private long id;
    private String nome;
    private String email;
    private String login;
    private String senha;
    private boolean primeiroacesso = true;
    private Perfil perfil;///ADMIN, PROFESSOR, ALUNO

    ///Construtor, serve para criar um novo aluno com os dados fornecidos
    /// Metodo especial que utilizado para criar um novo objeto da classe Aluno, recebe os dados do aluno e inicializa os atributos
    public Usuario(long id, String nome, String email,
        String login, String senha, Perfil perfil) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
    }

    public int getId() {
        return id;
    }   
    
    public void setId(int id) {
        if (id <=0) {
            throw new IllegalArgumentException("ID deve ser um número positivo");
        }
        this.id = id;
}
public int getId() {
    return id;
    }
}
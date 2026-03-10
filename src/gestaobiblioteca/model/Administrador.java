package gestaobiblioteca.model;

public class Administrador extends Usuario {
    public Administrador(long id, String nome, String email, 
        String login, String senha) {
        super(id, nome, email, login, senha, Perfil.ADMIN);
    }   
    
}

package gestaobiblioteca.view;

import gestaobiblioteca.model.Usuario;

public class UsuarioTela {

    public static void main(String[] args) {
            System.out.println("Tela de Usuário");

            Usuario usuario = new Usuario();
            usuario.setId(1);
            System.out.println("ID do usuário: " + usuario.getId());
    
    }
    }


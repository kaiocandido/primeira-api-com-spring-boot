package primeira_api_spring.demo.repository;

import org.springframework.stereotype.Repository;
import primeira_api_spring.demo.Model.Usuario;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    public void save(Usuario usuario) {
        if (usuario.getId() == null) {
            System.out.println("Save - Recebendo usuario na camada de repository");
        } else {
            System.out.println("Update - Recebendo usuario na camada de repository");
        }
    }

    public void deleteById(Integer id) {
        System.out.println(String.format("Delete/id - recebendo o id: %s para excluir um usuario", id));
    }

    public List<Usuario> findAll() {
        System.out.println("List - listando os usuarios do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("gleyson", "password"));
        usuarios.add(new Usuario("kaio", "master"));
        return usuarios;
    }

    public Usuario findById(Integer id) {
        System.out.println(String.format("Find/id - recebendo o id: %s", id));
        return new Usuario("gleyson", "password");
    }

    public Usuario findByUsername(String username) {
        System.out.println(String.format("Find username - recebendo username: %s", username));
        return new Usuario("gleyson", "password");
    }
}

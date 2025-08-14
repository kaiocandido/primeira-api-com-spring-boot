package primeira_api_spring.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import primeira_api_spring.demo.Model.Usuario;
import primeira_api_spring.demo.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {
    @Autowired
    private UserRepository repository;
    @GetMapping("")
    public List<Usuario> getUsers(){
        return repository.findAll();
    }
    @GetMapping("/{username}")
    public Usuario findOne(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }
    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }
    @PostMapping("")
    public void postUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }
}

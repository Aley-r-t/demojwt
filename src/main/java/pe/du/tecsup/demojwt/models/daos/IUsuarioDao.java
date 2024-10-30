package pe.du.tecsup.demojwt.models.daos;

import org.springframework.data.repository.CrudRepository;

import pe.du.tecsup.demojwt.models.entities.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{

    public Usuario findByUsername(String username);
}
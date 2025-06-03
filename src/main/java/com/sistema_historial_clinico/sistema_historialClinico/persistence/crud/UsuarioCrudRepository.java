package com.sistema_historial_clinico.sistema_historialClinico.persistence.crud;

import com.sistema_historial_clinico.sistema_historialClinico.persistence.entity.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioCrudRepository extends CrudRepository<Usuario, Integer> {


}

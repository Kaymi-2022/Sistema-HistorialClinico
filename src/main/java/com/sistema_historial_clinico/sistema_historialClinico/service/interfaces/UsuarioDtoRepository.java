package com.sistema_historial_clinico.sistema_historialClinico.service.interfaces;

import com.sistema_historial_clinico.sistema_historialClinico.persistence.entity.model.Usuario;
import com.sistema_historial_clinico.sistema_historialClinico.presentation.dto.UsuarioDTO;
import java.util.List;

public interface UsuarioDtoRepository {

    List<UsuarioDTO> listaUsuarios();

    UsuarioDTO obtenerUsuario(int usuarioId);

    UsuarioDTO guardarUsuario(UsuarioDTO usuario);

    void eliminarUsuario(int usuarioId);
}

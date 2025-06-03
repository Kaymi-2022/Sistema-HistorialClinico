package com.sistema_historial_clinico.sistema_historialClinico.service.implementation;

import com.sistema_historial_clinico.sistema_historialClinico.presentation.dto.UsuarioDTO;
import com.sistema_historial_clinico.sistema_historialClinico.service.interfaces.UsuarioDtoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    UsuarioDtoRepository usuarioDtoRepository;

    public List<UsuarioDTO> getAllUsuarios() {
        return usuarioDtoRepository.listaUsuarios();
    }

    public UsuarioDTO getUsuarioById(int id) {
        return usuarioDtoRepository.obtenerUsuario(id);
    }

    public UsuarioDTO createUsuario(UsuarioDTO usuario) {
        return usuarioDtoRepository.guardarUsuario(usuario);
    }

    public boolean deleteUsuario (int id){
        if(this.getUsuarioById(id) != null) {
            usuarioDtoRepository.eliminarUsuario(id);
            return true;
        }else {
            return false;
        }
    }
}

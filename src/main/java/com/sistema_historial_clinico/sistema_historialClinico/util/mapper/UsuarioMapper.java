package com.sistema_historial_clinico.sistema_historialClinico.util.mapper;

import com.sistema_historial_clinico.sistema_historialClinico.persistence.entity.model.Usuario;
import com.sistema_historial_clinico.sistema_historialClinico.presentation.dto.UsuarioDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {RolMapper.class})
public interface UsuarioMapper {
    // ---- Mapeo Entidad → DTO ----
    @Mappings({
          @Mapping(target = "id", source = "idUsuario"),
          @Mapping(target = "usuario", source = "username"),
          @Mapping(target = "nombre", source = "name"),
          @Mapping(target = "apellidos", source = "lastname"),
          @Mapping(target = "correo", source = "email"),
          @Mapping(target = "phone", source = "telefono"),
          @Mapping(target = "specialty", source = "especialidad"),
          @Mapping(target = "numbercollegiate", source = "numeroColegiado"),
          @Mapping(target = "nombreRol", source = "rol.nombreRol"),
    })
    UsuarioDTO toUsuarioDTOList(Usuario usuario);
    List<UsuarioDTO> toUsuarioDTOList(List<Usuario> usuario);

    @InheritInverseConfiguration
    // Campos ignorados:
    @Mapping(target = "password", ignore = true)
    @Mapping(target = "activo", constant = "true")
    @Mapping(target = "fechaCreacion", expression = "java(new java.util.Date())")
    @Mapping(target = "citas", ignore = true)
    @Mapping(target = "consultas", ignore = true)
    @Mapping(target = "pacientes", ignore = true)
    @Mapping(target = "fotoPerfil", ignore = true)
    Usuario toEntity(UsuarioDTO usuarioDTO);

}

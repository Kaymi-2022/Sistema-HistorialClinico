package com.sistema_historial_clinico.sistema_historialClinico.persistence.entity.model;

import com.sistema_historial_clinico.sistema_historialClinico.persistence.entity.enums.Genero;
import com.sistema_historial_clinico.sistema_historialClinico.persistence.entity.enums.TipoDocumento;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "pacientes")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "paciente_id")
    private Integer idPaciente;

    private TipoDocumento tipoDocumento;

    private String numeroDocumento;

    private String nombre;

    private String apellidos;

    private String fechaNacimiento;

    private Genero genero;

    private Double peso;

    private Double altura;

    private String alergias;

    private String alergiasMedicamentos;

    private String enfermedadesPrevias;

    private String nombreTutor;

    private String telefonoTutor;

    private String emailTutor;

    private String relacionTutor;

    private String fotoPaciente;

    private Boolean estado;

    private Date fechaRegistro;

    @OneToOne(mappedBy = "paciente")
    private HistoriaClinica historiaClinica;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @OneToMany(mappedBy = "paciente")
    private List<Radiografia> radiografias;

}

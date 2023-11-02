package com.tarefa.caio.projeto.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tb_usuarios")
public class UsuarioModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_usuario", nullable = false)
    private UUID id;

    private String nome;
    private String email;
    private String sobrenome;
    private String tipo_usuario;

    private String telefone;
    private String senha;

    private String data_cadastro;
    private String data_ferias;
    private String designacao;
    private String estado;
    private String cidade;
    private String hora_semanal;
    private String url_img;
}
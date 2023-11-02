package com.tarefa.caio.projeto.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.springframework.web.multipart.MultipartFile;

public record UsuarioDto(

        @NotBlank String nome,

        @NotBlank @Email(message = "O email deve estar no formato válido!") String email,
        @NotBlank String sobrenome,

        String tipo_usuario,

        String telefone,
        String senha,

        String data_cadastro,
        String data_ferias,
        String designacao,
        String estado,
        String cidade,
        String hora_semanal,

        MultipartFile imagem

){

}
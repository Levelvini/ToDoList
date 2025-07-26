package com.levelvini.rodeira.ToDoList.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;
import jakarta.validation.constraints.Email;


@AllArgsConstructor
public class UserRequest {
    @NotBlank(message = "O nome não foi incerido corretamente")
    @Size(min = 4,message = "O tamanho minimo do nome deve ser maior que 3 caracteres")
    public String name;
    @NotBlank(message = "Verifique o e-mail e tente novamente!")
    //@Email
    public String email;
    @NotBlank
    @Size(message = "A senha deve ter no mínimo 8 caracteres",min = 8)
    public String password;
    @NotBlank
    //@CPF
    private String cpf;
    @NotBlank
    private String birthday;
    @NotBlank
    private String gender;
}

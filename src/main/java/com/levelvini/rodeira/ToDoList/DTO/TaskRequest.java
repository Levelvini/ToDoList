package com.levelvini.rodeira.ToDoList.DTO;

import com.levelvini.rodeira.ToDoList.entities.User;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public class TaskRequest {
    @NotBlank(message = "verifique o nome da tarefa e tente novamente")
    public String title;
    public String description;
    public LocalDate date;
    public User user;
}

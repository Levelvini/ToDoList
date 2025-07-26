package com.levelvini.rodeira.ToDoList.DTO;

import com.levelvini.rodeira.ToDoList.entities.User;
import com.levelvini.rodeira.ToDoList.entities.enums.Status;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
public class TaskResponse {
    public String id;
    public String title;
    public String description;
    public LocalDate date;
    public Status status;
    public User user;
}

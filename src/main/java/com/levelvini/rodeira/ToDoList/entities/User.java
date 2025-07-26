package com.levelvini.rodeira.ToDoList.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class User {

    @Id
    private Long id;
    private String username;
    private String password;
    private String email;
    private String CPF;
    private String birthday;
    private String gender;

    @OneToMany(mappedBy = "user")
    private List<Task> tasks;
}

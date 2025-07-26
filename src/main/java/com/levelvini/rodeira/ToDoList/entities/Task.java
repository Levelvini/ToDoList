package com.levelvini.rodeira.ToDoList.entities;

import com.levelvini.rodeira.ToDoList.entities.enums.Status;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "tasks")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private LocalDate date;
    private Status status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}

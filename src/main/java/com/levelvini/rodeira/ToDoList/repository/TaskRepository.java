package com.levelvini.rodeira.ToDoList.repository;

import com.levelvini.rodeira.ToDoList.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {
}

package com.levelvini.rodeira.ToDoList.repository;

import com.levelvini.rodeira.ToDoList.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}

package com.levelvini.rodeira.ToDoList.DTO;

import com.levelvini.rodeira.ToDoList.entities.Task;
import com.levelvini.rodeira.ToDoList.entities.User;

import java.util.List;
import java.util.stream.Collectors;

public class UserResponse {
    public Long id;
    public String name;
    public List<Long> tasks;

    public UserResponse(Long id, String name, List<Long> tasks) {
        this.id = id;
        this.name = name;
        this.tasks = tasks;
    }

    public UserResponse toUserResponse(User user) {
        return new UserResponse(user.getId(), user.getUsername(), user.getTasks().stream()
                .map(Task::getId).collect(Collectors.toList()));
    }
}

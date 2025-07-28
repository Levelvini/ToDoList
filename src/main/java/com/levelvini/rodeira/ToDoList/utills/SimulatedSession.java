package com.levelvini.rodeira.ToDoList.utills;

import com.levelvini.rodeira.ToDoList.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SimulatedSession {
    private User userLogged;

    public SimulatedSession(User userLogged) {
        this.userLogged = userLogged;
    }
}

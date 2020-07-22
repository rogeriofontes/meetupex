package br.com.meetup.ex.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AttendeeService {
    public String greeting(String name) {
        return "Olá!" + name + "." + System.lineSeparator() +
                "Pode me seguir: @rogeriofontes" + System.lineSeparator();
    }
}

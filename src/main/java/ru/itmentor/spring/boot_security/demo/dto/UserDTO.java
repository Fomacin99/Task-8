package ru.itmentor.spring.boot_security.demo.dto;

import jakarta.validation.constraints.NotEmpty;

import java.util.List;

public class UserDTO {

    @NotEmpty(message = "Name should not be empty")
    private String name;

    private String password;

    public String getName() {
        return name;
    }

    public void setName(@NotEmpty(message = "Name should not be empty") String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(Long id) {

    }

    public Long getId() {
        return null;
    }

    public void setUsername(String username) {

    }

    public void setRoleIds(List<Object> collect) {

    }

    public Object getUsername() {
        return getUsername();
    }
}

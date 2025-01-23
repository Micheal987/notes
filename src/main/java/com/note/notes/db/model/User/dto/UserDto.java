package com.note.notes.db.model.User.dto;

public class UserDto {

    private Integer id;
    private String UserName;
    private String email;
    private String Password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return UserName;
    }

    public void setName(String name) {
        this.UserName = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }
}

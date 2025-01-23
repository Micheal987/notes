/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.note.notes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.note.notes.db.model.User.User;
import com.note.notes.db.model.User.dto.ResponseMessage;
import com.note.notes.db.model.User.dto.UserDto;
import com.note.notes.service.IUserService;

/**
 *
 * @author Noah1
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService useService;

    @PostMapping
    public ResponseMessage<User> add(UserDto user) {
        User UserNew = useService.add(user);
        return ResponseMessage.success(UserNew);
    }

    @PostMapping("/add")
    public @ResponseBody ResponseMessage<User> UserAdd(UserDto user) {
                User UserNew = useService.add(user);
        return ResponseMessage.success(UserNew);
    }
}

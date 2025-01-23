/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.note.notes.service;

import com.note.notes.db.model.User.User;
import com.note.notes.db.model.User.dto.UserDto;

/**
 *
 * @author Noah1
 */
public interface IUserService {
    // 插入用戶
    User add(UserDto user);
}

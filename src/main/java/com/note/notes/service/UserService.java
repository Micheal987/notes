package com.note.notes.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.note.notes.Repository.UserRepository;
import com.note.notes.db.model.User.User;
import com.note.notes.db.model.User.dto.UserDto;

@Service // spring bean
public class UserService implements IUserService {
    @Autowired
    UserRepository useRepository;

    @Override
    public User add(UserDto user) {
        User userMod = new User();
        BeanUtils.copyProperties(user, userMod);
        return useRepository.save(userMod);
    }
}

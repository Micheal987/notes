/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.note.notes.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.note.notes.db.model.User.User;

/**
 *
 * @author Noah1
 */
@Repository //spring bean
public interface UserRepository extends CrudRepository<User,Integer> {

}

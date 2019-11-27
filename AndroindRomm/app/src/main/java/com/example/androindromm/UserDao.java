package com.example.androindromm;

import androidx.room.Dao;

import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao

public interface UserDao{
    @Query("SELECT * From user")
    List<User> getAll();

    @Insert
    void insert(User user);


}

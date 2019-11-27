package com.example.androindromm;
import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {User.class},version = 5)

public abstract class AppDatabase extends RoomDatabase{
    abstract UserDao userDao();
}

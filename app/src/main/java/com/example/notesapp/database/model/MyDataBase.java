package com.example.notesapp.database.model;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.notesapp.daos.NotesDao;

@Database(entities = {Note.class} , version = 1 , exportSchema = false)
public abstract class MyDataBase extends RoomDatabase {

    private static MyDataBase dataBase;
    private final static String DATABASE_NAME = "notesAppRoute";


    public abstract NotesDao notesDao();

    public static MyDataBase getInstance(Context context){
        if(dataBase==null){
            dataBase = Room.databaseBuilder(context,MyDataBase.class,DATABASE_NAME)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }
        return dataBase;
    }


}

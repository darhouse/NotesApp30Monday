package com.example.notesapp.database.model;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class Note {


    @PrimaryKey(autoGenerate = true)
    int id;
    @ColumnInfo(name = "name")
    String title;
    String time;
    String content;


    public Note(){

    }

    @Ignore
    public Note(String title,String time, String content){
        this.title=title;
        this.time=time;
        this.content=content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}

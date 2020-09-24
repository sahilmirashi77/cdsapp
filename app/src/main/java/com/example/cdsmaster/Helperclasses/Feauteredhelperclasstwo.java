package com.example.cdsmaster.Helperclasses;

import android.content.Intent;

public class Feauteredhelperclasstwo {


    int image;
    String  title,description;

    public Feauteredhelperclasstwo(int image, String title, String description) {
        this.image = image;
        this.title = title;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}

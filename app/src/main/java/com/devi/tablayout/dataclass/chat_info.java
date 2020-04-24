package com.devi.tablayout.dataclass;

public class chat_info {

    String name;
    String messege;
    String date;
    int photo;

    public chat_info(String name, String messege, String date, int photo) {
        this.name = name;
        this.messege = messege;
        this.date = date;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessege() {
        return messege;
    }

    public void setMessege(String messege) {
        this.messege = messege;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}

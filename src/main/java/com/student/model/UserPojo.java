package com.student.model;


public class UserPojo {
    /*
        {
            "id": 5,
            "name": "Leanne Graham",
            "username": "Bret",
            "email": "Sincere5@april.biz",
            private List<String> courses;
        }
    */

    private int id;
    private String name;
    private String userName;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

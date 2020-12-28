package com.omkar.Practise.hello_world;


public class HelloWorldBean {
    private String message;
    private int date;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

//    @Override
//    public String toString() {
//        return "HelloWorldBean{" +
//                "message='" + message + '\'' +
//                '}';
//    }


}

package com.example.week04_lab_20010211_huynhminhthu.entities;

//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//@NoArgsConstructor
//@Setter
//@ToString
public class Student {
    private long id;
    private String name;

    public Student() {
    }

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

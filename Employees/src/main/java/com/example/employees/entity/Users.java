package com.example.employees.entity;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class Users {
    public Users(int userId, int age, String name, float salary) {
        super();
        this.userId = userId;
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public Users() {
        super();
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;

    @Column(name = "age")
    private int age;

    @Column(name = "name")
    private String name;

    @Column(name = "salary")
    private float salary;
}

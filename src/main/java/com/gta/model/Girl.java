package com.gta.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Girl
 * Created by ningning.jiang on 2017/8/3.
 */
@Entity
public class Girl {

    private int id;
    private String cupSize;
    private int age;

    public Girl() {
    }

    public Girl(int id, String cupSize, int age) {
        this.id = id;
        this.cupSize = cupSize;
        this.age = age;
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "id=" + id +
                ", cupSize='" + cupSize + '\'' +
                ", age=" + age +
                '}';
    }
}

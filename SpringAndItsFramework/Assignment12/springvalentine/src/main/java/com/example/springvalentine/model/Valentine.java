package com.example.springvalentine.model;

import java.sql.Date;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Valentine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Date date;

    @Column
    private String gift;

    @Column
    private String location;
    public Valentine() {
    }
    public Valentine(Date date, String gift, String location) {
        this.date = date;
        this.gift = gift;
        this.location = location;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getGift() {
        return gift;
    }
    public void setGift(String gift) {
        this.gift = gift;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    
}

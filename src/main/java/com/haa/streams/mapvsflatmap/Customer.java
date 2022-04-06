package com.haa.streams.mapvsflatmap;

import java.util.List;

public class Customer {

    private Integer id;
    private String name;
    private String email;
    private List<Integer> mobile;

    public Customer() {
    }

    public Customer(Integer id, String name, String email, List<Integer> mobile) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Integer> getMobile() {
        return mobile;
    }

    public void setMobile(List<Integer> mobile) {
        this.mobile = mobile;
    }

}

package com.thanks.entity;

import javax.persistence.*;


@Entity(name = "demo")
@Table(name = "DEMO")
public class Demo {

    private Long id;

    private String name;

    private String addr;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "ADDR")
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}

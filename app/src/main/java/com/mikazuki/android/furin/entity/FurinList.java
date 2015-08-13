package com.mikazuki.android.furin.entity;

/**
 * Created by matsuMac on 2015/08/11.
 */
public class FurinList {
    private int id;
    private String name;

    public FurinList(int id, String name) {
        this.id = id;
        this.name = name;
    }

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
}

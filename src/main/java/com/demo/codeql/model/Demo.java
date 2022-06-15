package com.demo.codeql.model;

public class Demo {

    private String Name;

    private Integer version;

    public Demo() {
    }

    public Demo(String name, Integer version) {
        this.Name = name;
        this.version = version;
        incrementVersion();
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    private void incrementVersion() {
        version = version + 1;
    }
}

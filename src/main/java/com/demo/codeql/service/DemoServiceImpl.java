package com.demo.codeql.service;

import com.demo.codeql.model.Demo;

public class DemoServiceImpl implements DemoService{

    @Override
    public Demo createDemo(String name, Integer version) {
        return new Demo(name, version);
    }
}

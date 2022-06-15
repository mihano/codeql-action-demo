package com.demo.codeql.service;

import com.demo.codeql.model.Demo;

public interface DemoService {

    Demo createDemo(String name, Integer version);
}

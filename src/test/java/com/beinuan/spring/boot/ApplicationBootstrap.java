package com.beinuan.spring.boot;


import com.beinuan.spring.boot.bean.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ApplicationBootstrap {


    // 装配Employee
    @Autowired
    private Employee employee;


    @Value("${beinuan-name}")
    private String data;

    @Test
    public void testOneData() {

        System.out.println("单个数据 = " + data);
    }

    @Test
    public void testReadData() {
        System.out.println(employee);
    }
}

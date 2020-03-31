package com.beinuan.spring.boot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

@Component  //加入IOC容器
@ConfigurationProperties(prefix = "employee") //指定Employee在容器的前缀
public class Employee {

    private Integer Id;      // 员工id
    private String name;     // 员工姓名
    private Boolean leader;  // 是否为领导
    private Date birthday;   // 出声日期
    private String[] roles;  // 角色
    private Map<String,String> salType; // 工资类型
    private Dept dept;       // 所在部门


    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getLeader() {
        return leader;
    }

    public void setLeader(Boolean leader) {
        this.leader = leader;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public Map<String, String> getSalType() {
        return salType;
    }

    public void setSalType(Map<String, String> salType) {
        this.salType = salType;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", leader=" + leader +
                ", birthday=" + birthday +
                ", roles=" + Arrays.toString(roles) +
                ", salType=" + salType +
                ", dept=" + dept +
                '}';
    }
}

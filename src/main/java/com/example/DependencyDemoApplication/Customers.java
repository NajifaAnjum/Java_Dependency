package com.example.DependencyDemoApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customers {
    private int custid;
    private String custname;
    private String coursename;
    @Autowired
    private Technologies technologies;

    public Technologies getTechnologies() {
        return technologies;
    }

    public void setTechnologies(Technologies technologies) {
        this.technologies = technologies;
    }



    public int getCustid() {
        return custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }
    public void display(){
        System.out.println("returned successfully");
        technologies.tech();
    }
}

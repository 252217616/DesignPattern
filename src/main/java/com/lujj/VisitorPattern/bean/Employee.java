package com.lujj.VisitorPattern.bean;

import com.lujj.VisitorPattern.IVisitor;
import lombok.Data;

@Data
public abstract class Employee {
    public final static int MALE = 0;  //0代表是男性
    public final static int FEMALE = 1; //1代表是女性
    private int salary;
    private String  name;
    private int sex;

    public abstract void accept(IVisitor visitor);
}

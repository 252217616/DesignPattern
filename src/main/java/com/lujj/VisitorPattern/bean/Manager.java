package com.lujj.VisitorPattern.bean;

import com.lujj.VisitorPattern.IVisitor;
import lombok.Data;

@Data
public class Manager extends Employee{
    private String performance;


    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}

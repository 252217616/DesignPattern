package com.lujj.VisitorPattern.bean;

import com.lujj.VisitorPattern.IVisitor;
import lombok.Data;

/**
 * 普通员工
 */
@Data
public class CommonEmployee extends Employee{
    private String job;

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}

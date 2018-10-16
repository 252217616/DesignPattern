package com.lujj.VisitorPattern;

import com.lujj.VisitorPattern.bean.CommonEmployee;
import com.lujj.VisitorPattern.bean.Manager;

/**
 * 访问者类
 */
public interface IVisitor {
    //首先，定义我可以访问普通员工
    void visit(CommonEmployee commonEmployee);
    //可以访问部门经理
    void visit(Manager manager);

    int getTotalSalary();
}

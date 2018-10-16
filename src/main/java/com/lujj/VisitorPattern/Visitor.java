package com.lujj.VisitorPattern;

import com.lujj.VisitorPattern.bean.CommonEmployee;
import com.lujj.VisitorPattern.bean.Employee;
import com.lujj.VisitorPattern.bean.Manager;

public class Visitor implements IVisitor{

    private int commonTotal = 0;
    private int managerTotal = 0;

    @Override
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(this.getCommonEmployee(commonEmployee));
        commonTotal = commonTotal+commonEmployee.getSalary();
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(this.getManagerInfo(manager));
        managerTotal = managerTotal +manager.getSalary();
    }

    @Override
    public int getTotalSalary() {
        return managerTotal+commonTotal;
    }

    //组装出基本信息
    private String getBasicInfo(Employee employee){
        String info = " 姓名：" + employee.getName() + "\t";
        info = info + " 性别：" + (employee.getSex() == Employee.FEMALE?" 女 ":" 男 ") + "\t";
        info = info + " 薪水：" + employee.getSalary()  + "\t";
        return info;
    }
    //组装出部门经理的信息
    private String getManagerInfo(Manager manager){
        String basicInfo = this.getBasicInfo(manager);
        String otherInfo = " 业绩："+manager.getPerformance() + "\t";
        return basicInfo + otherInfo;
    }
    //组装出普通员工信息
    private String getCommonEmployee(CommonEmployee commonEmployee){
        String basicInfo = this.getBasicInfo(commonEmployee);
        String otherInfo = " 工作："+commonEmployee.getJob()+"\t";
        return basicInfo + otherInfo;
    }
}

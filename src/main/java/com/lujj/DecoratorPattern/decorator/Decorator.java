package com.lujj.DecoratorPattern.decorator;

import com.lujj.DecoratorPattern.SchoolReport;

public abstract class Decorator implements SchoolReport {

    private SchoolReport schoolReport;

    public Decorator(SchoolReport schoolReport){
        this.schoolReport = schoolReport;
    }

    @Override
    public void reprot(){
        this.schoolReport.reprot();
    }

    @Override
    public void sign(String name){
        this.schoolReport.sign(name);
    }

}

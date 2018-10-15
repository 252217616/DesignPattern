package com.lujj.DecoratorPattern;

import com.lujj.DecoratorPattern.decorator.HighScoreDecorator;
import com.lujj.DecoratorPattern.decorator.MySchoolReport;

public class Father {

    /**
     * 经过装饰可以增加单一时间，并且可以随着实现改变顺序。
     * @param args
     */
    public static void main(String[] args) {
        //拿过成绩单
        SchoolReport schoolReport = new MySchoolReport();
        //查看成绩
        schoolReport = new HighScoreDecorator(schoolReport);
        schoolReport = new SortDecorator(schoolReport);
        schoolReport.reprot();
        //签名
        schoolReport.sign("老爸！");
    }
}

package com.lujj.CommandMode.command;

/**
 * 增加需求命令
 */
public class AddRequirementCommand extends Command {
    @Override
    public void execute() {
        //找到需求组
        super.reqG.find();
        //增加一个需求
        super.reqG.add();
        //页面也增加
        super.pg.add();
        //功能也增加
        super.cg.add();
        //给出计划
        super.reqG.plan();
    }
}

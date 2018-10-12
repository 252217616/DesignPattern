package com.lujj.CommandMode.command;

public class DeletePageCommand extends Command {
    @Override
    public void execute() {
        //找到美工组
        super.pg.find();
        //删除一页
        super.pg.delete();
        //给出计划
        super.pg.plan();
    }
}

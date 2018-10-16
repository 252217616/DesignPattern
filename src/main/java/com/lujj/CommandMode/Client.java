package com.lujj.CommandMode;

import com.lujj.CommandMode.command.AddRequirementCommand;
import com.lujj.CommandMode.command.Command;

/**
 * 命令模式
 */
public class Client {
    public static void main(String[] args) {
        //客户要求增加需求
        Invoker invoker = new Invoker();
        Command command = new AddRequirementCommand();
        invoker.setCommand(command);
        invoker.action();

    }
}

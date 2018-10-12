package com.lujj.CommandMode;

import com.lujj.CommandMode.command.Command;

/**
 * 负责人
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action(){
        this.command.execute();
    }
}

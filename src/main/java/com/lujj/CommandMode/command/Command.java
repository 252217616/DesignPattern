package com.lujj.CommandMode.command;

import com.lujj.CommandMode.service.CodeGroup;
import com.lujj.CommandMode.service.PageGroup;
import com.lujj.CommandMode.service.RequirementGroup;

public abstract class Command {
    protected RequirementGroup reqG = new RequirementGroup();
    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();

    public abstract void  execute();
}

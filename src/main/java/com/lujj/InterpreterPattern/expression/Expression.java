package com.lujj.InterpreterPattern.expression;

import java.util.HashMap;

public abstract class Expression {

    public abstract int interpreter(HashMap<String,Integer> var);
}

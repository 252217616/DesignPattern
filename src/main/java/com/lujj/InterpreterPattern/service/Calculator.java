package com.lujj.InterpreterPattern.service;

import com.lujj.InterpreterPattern.expression.AddExpression;
import com.lujj.InterpreterPattern.expression.Expression;
import com.lujj.InterpreterPattern.expression.SubExpression;
import com.lujj.InterpreterPattern.expression.VarExpression;

import java.util.HashMap;
import java.util.Stack;

/**
 * 封装类
 */
public class Calculator {
    //定义表达式
    private Expression expression;
    //构造函数传入公式
    public Calculator (String expStr){
        //定义一个栈，安排运算的先后顺序
        Stack<Expression> stack = new Stack<Expression>();
        //表达式拆分为字符数组
        char[] charArray = expStr.toCharArray();
        //运算
        Expression left = null;
        Expression right = null;
        for(int i=0;i<charArray.length;i++){
            switch (charArray[i]) {
                case '+'://加法
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left,right));
                    break;
                case '-'://减法
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left,right));
                default: //公式中的变量
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
            }
        }
        this.expression = stack.pop();
    }

    //开始运算
    public int run (HashMap<String,Integer> map){
        return this.expression.interpreter(map);
    }
}
